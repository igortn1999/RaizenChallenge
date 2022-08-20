@echo off

SET WORK=%PWD%
cd "%WORK%\react\app"
npm "install"
cd "%WORK%\docker-compose\postgresSQL\"
SET FILE= "ls *.yml | grep .yml"
docker-compose "-f" "%FILE%" "up" "-d"
