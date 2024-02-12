# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Add Maintainer Info
MAINTAINER kenny

# Update the package lists for upgrades and new packages, then install curl
RUN apt-get update && apt-get install -y curl

# Add the application's jar to the container
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

# Execute the jar file
ENTRYPOINT ["java","-jar","eurekaserver-0.0.1-SNAPSHOT.jar"]