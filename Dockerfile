FROM eclipse-temurin:11
RUN apt-get update && apt-get -y upgrade
RUN apt-get install -y inotify-tools
ENV HOME=/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD ./ $HOME
RUN ./mvnw dependency:go-offline