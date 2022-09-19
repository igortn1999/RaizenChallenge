#!/bin/bash

WORK=$(PWD)
cd $WORK/react/app

#update node/dependencies
npm install

#make sure there is a jar in target folder. If there aren't any, copy from backup
JAR=$(ls -1 target/ | grep -c .jar)

if [ $JAR -eq "0" ] 
then
    cp $WORK/javaDeploy/*.jar $WORK/target/raizen-api.jar
    echo "no jar found, copying .jar from javaDeploy/"
fi

#start docker-compose
cd  $WORK/docker-compose/postgresSQL/
docker-compose -f $(ls *.yml) up -d
