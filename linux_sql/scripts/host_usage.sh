#!/bin/bash

#check if there is a valid number of arguments
if [ "$#" -ne 5 ]; then
    echo "Illegal number of arguments. Correct Usage: ./host_usage.sh psql_host psql_port db_name psql_user psql_password"
    exit 1
fi

#assign CLI arguments to variables (e.g. `psql_host=$1`)
psql_host=$1
psql_port=$2
db_name=$3
psql_user=$4
psql_password=$5

#set password to an environment variable
export PGPASSWORD=$psql_password

vmstat_t=$(vmstat -t)
vmstat_d=$(vmstat -d)

#parse host hardware specifications using bash cmds
timestamp=$(date '+%Y-%m-%d %H:%M:%S')
hostname=$(hostname -f)
memory_free=$(echo "$(vmstat --unit M)" | tail -1 | awk '{print $4}' | xargs)
cpu_idle=$(echo "$vmstat_t" | tail -1 | awk '{print $15}' | xargs)
cpu_kernel=$(echo "$vmstat_t" | tail -1 | awk '{print $14}' | xargs)
disk_io=$(echo "$vmstat_d" | tail -1 | awk '{print $10}' | xargs)
disk_available=$(echo "$(df -BM ~)" | tail -1 | awk '{$4=substr($4,1,length($4)-1); print $4}' | xargs)

#construct the INSERT statement
insert_stmt="INSERT INTO host_usage (timestamp, host_id, memory_free, cpu_idle, cpu_kernel, disk_io, disk_available)
VALUES ('$timestamp', (SELECT id FROM host_info WHERE host_info.hostname = '$hostname'), '$memory_free', '$cpu_idle', '$cpu_kernel', '$disk_io', '$disk_available');"

#execute the INSERT statement through psql CLI tool
psql -h $psql_host -p $psql_port -U $psql_user -d $db_name -c "$insert_stmt"

exit $?