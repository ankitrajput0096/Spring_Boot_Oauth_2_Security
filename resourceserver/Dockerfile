# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /resourceServer
WORKDIR /resourceServer/resourceserver

# building the spring boot app
RUN mvn clean install

WORKDIR /resourceServer/resourceserver/target


# running the spring boot app
CMD ["java", "-jar", "resourceserver-0.0.1-SNAPSHOT.jar"]

