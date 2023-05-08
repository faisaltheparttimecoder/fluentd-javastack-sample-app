FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/java-stack-complex-spring-webflux-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ADD run.sh run.sh
ENTRYPOINT ["/bin/sh","run.sh"]