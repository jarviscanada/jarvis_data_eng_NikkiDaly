#!/bin/bash

#setup the arguments
command=$1
db_username=$2
db_password=$3
container="jrvs_psql"

#if docker contaner is not running, start docker container
systemctl status docker || systemctl start docker

if [ "$command" == "create" ]; then
  # check if container is already created
  if [ $(docker container ls -a -f name=$container | wc -l) -eq 2 ]; then
    echo "The container jrvs_psql has already been created"
    exit 1
  fi

  #check if db_username and password is passed in arguments
  if [ "$#" -lt 3 ]; then
    echo "Illegal number of arguments. Correct Usage: ./psql_docker.sh start|stop|create [db_username][db_password]"
    exit 1
  fi

  #pull postgres and create `pgdate` volume
  docker pull postgres
  docker volume create pgdata

  #create a psql container
  docker run --name $container -e POSTGRES_PASSWORD=${db_password} -e POSTGRES_USER=${db_username} -d -v pgdata:/var/lib/postgresql/data -p 5432:5432 postgres
  exit $?
fi

#check if jrvs-pql container is created or not
if [ $(docker container ls -a -f name=$container | wc -l) -ne 2 ]; then
  echo "Container jrvs-sql has not been created yet. Correct Usage: ./psql_docker.sh start|stop|create [db_username][db_password]"
  exit 1
fi

#start docker container
if [ "$command" = "start" ]; then
  docker container start $container
  exit $?
fi

#stop docker container
if [ "$command" = "stop" ]; then
  docker container stop $container
  exit $?
fi

#if the command is invalid print error and correct usage
echo "Invalid command. Correct Usage: ./psql_docker.sh start|stop|create [db_username][db_password]"
exit 1