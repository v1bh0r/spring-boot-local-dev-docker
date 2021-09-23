FROM eclipse-temurin:11
ENV HOME=/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD ./ $HOME
RUN ./mvnw dependency:go-offline