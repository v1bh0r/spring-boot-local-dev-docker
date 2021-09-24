#!/bin/bash
dos2unix mvnw
./mvnw spring-boot:run &
while true; do
  inotifywait -e modify,create,delete,move -r ./src/ && ./mvnw install
done
