FROM openjdk
ADD target/demo-0.0.1-SNAPSHOT.jar /container/backend.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/container/backend.jar"]



