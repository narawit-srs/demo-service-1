FROM adoptopenjdk/openjdk8-openj9
COPY ./target/demo-service-0.0.1-SNAPSHOT.jar /usr/local/lib/demo-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo-service-0.0.1-SNAPSHOT.jar"]