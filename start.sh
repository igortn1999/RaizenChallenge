#!/bin/bash

WORK=$(PWD)
cd $WORK/react/app
npm install

cd  $WORK/docker-compose/postgresSQL/
FILE=ls *.yml | grep .yml #TODO fix docker-compose command
docker-compose -f $(ls *.yml) up -d
