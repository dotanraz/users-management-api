#!/bin/sh

########################################
# start or restart postgres db container
# properties:
# port: 5432
# user: postgres
# password: 1234
########################################

echo stop existing postgres db if exist...
docker stop postgres1
sleep 5
echo run docker prune to remove old containers not in use
docker system prune -f
echo hard un-binding port 5432...
sudo kill -9 `sudo lsof -t -i:5432`
echo start postgres container...
docker run --name postgres1 -e PGDATA=/tmp -e POSTGRES_PASSWORD=1234 -p 5432:5432 -v /home/squid/Documents/dbs/postgres1:/var/lib/postgresql/data -d postgres
docker ps