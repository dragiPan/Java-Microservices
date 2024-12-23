FROM openjdk:17-jdk-slim

LABEL org.opencontainers.image.authors="Dragi Pantovic"

WORKDIR /app

COPY target/accounts-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]