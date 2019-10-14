#!/bin/sh

########################################
#
########################################

echo stop existing postgres db if exist...
docker stop postgres1
sleep 5
echo run docker prune to remove old containers not in use
docker system prune -f
echo hard un-binding port 5432...
sudo kill -9 `sudo lsof -t -i:5432`