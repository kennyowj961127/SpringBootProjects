# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Add Maintainer Info
MAINTAINER kenny

# Add the application's jar to the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the jar file
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]
