FROM openjdk:17-jdk-slim

MAINTAINER kenny

# Update the package lists for upgrades and new packages, then install curl
RUN apt-get update && apt-get install -y curl

COPY target/message-0.0.1-SNAPSHOT.jar message-0.0.1-SNAPSHOT.jar
COPY target/classes/opentelemetry-javaagent-1.32.0.jar opentelemetry-javaagent-1.32.0.jar

ENTRYPOINT ["java","-jar","message-0.0.1-SNAPSHOT.jar"]