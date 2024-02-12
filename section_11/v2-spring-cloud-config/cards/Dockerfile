FROM openjdk:17-jdk-slim

MAINTAINER kenny

# Update the package lists for upgrades and new packages, then install curl
RUN apt-get update && apt-get install -y curl

COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","cards-0.0.1-SNAPSHOT.jar"]
