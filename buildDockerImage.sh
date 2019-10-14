#!/bin/sh
./gradlew clean build
docker build -t user-mngmnt-api -f ./docker/Dockerfile .