FROM java:8-jdk-alpine
MAINTAINER prasadbolla
VOLUME /tmp
COPY ./target/ExtGetServiceInfoAPI-0.0.1-SNAPSHOT.jar ExtGetServiceInfoAPI.jar
ENTRYPOINT ["java","-jar","ExtGetServiceInfoAPI.jar"]
