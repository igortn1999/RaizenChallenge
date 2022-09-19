#!/bin/bash

WORK=$(PWD)
cd $WORK/react/app
npm install
#docker network create db
cd  $WORK/docker-compose/postgresSQL/
docker-compose -f $(ls *.yml) up -d
