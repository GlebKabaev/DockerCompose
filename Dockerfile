FROM openjdk:21

WORKDIR /app

COPY target/my-spring-project-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]