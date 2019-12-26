FROM java:8-jdk-alpine
MAINTAINER prasadbolla
WORKDIR /usr/src/app

COPY /target/ExtGetServiceInfoAPI-0.0.1-SNAPSHOT.jar ExtGetServiceInfoAPI.jar
ENTRYPOINT ["java","-jar","ExtGetServiceInfoAPI.jar"]
