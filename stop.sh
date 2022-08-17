#!/bin/bash

WORK=$(PWD)

cd  $WORK/docker-compose/postgresSQL/
docker-compose -f $(ls *.yml) down
