#!/bin/sh

########################################
# stop postgres db container
########################################

echo stop existing postgres db...
docker stop postgres1
docker ps