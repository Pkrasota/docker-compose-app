FROM openjdk:17
COPY target/demo-docker-compose-app-0.0.1-SNAPSHOT.jar docker-compose-app.jar
ENTRYPOINT ["java", "-jar", "docker-compose-app.jar"]