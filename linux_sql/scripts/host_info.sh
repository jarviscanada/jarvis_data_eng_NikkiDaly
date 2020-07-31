#!/bin/bash

#check if there is a valid number of arguments
if [ "$#" -ne 5 ]; then
    echo "Illegal number of arguments. Correct Usage: ./host_info.sh psql_host psql_port db_name psql_user psql_password"
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

#save result outputs for repeated use
lscpu_out=`lscpu`
mem_out=`cat /proc/meminfo`

#get the hardware specifications data and save them to variables
hostname=$(hostname -f)
cpu_number=$(echo "$lscpu_out" | egrep "^CPU\(s\):" | awk '{print $2}' | xargs)
cpu_architecture=$(echo "$lscpu_out" | egrep "^Architecture:" | awk '{print $2}' | xargs)
cpu_model=$(echo "$lscpu_out"  | egrep "^Model:" | awk '{print $2}' | xargs)
cpu_mhz=$(echo "$lscpu_out"  | egrep "^CPU MHz:" | awk '{print $3}' | xargs)
L2_cache=$(echo "$lscpu_out"  | egrep "^L2 cache:" | awk '{$3=substr($3,1,length($3)-1); print $3}' | xargs)
total_mem=$(echo "$mem_out" | egrep "MemTotal:" | awk '{print $2}' | xargs)
timestamp=$(date '+%Y-%m-%d %H:%M:%S')

#construct the INSERT statement.
insert_stmt="INSERT INTO host_info (hostname, cpu_number, cpu_architecture, cpu_model, cpu_mhz, L2_cache, total_mem, timestamp)
VALUES ('$hostname', '$cpu_number', '$cpu_architecture', '$cpu_model', '$cpu_mhz', '$L2_cache', '$total_mem', '$timestamp');"

#execute the INSERT statement
psql -h $psql_host -p $psql_port -U $psql_user -d $db_name -c "$insert_stmt"

exit $?