#!/bin/bash
dos2unix mvnw
./mvnw spring-boot:run -Drun.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005" &
while true; do
  inotifywait -e modify,create,delete,move -r ./src/ && ./mvnw install
done
