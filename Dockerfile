FROM openjdk:11-slim
WORKDIR /app
COPY target/h2_example-0.0.1-SNAPSHOT.jar h2_example-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "h2_example-0.0.1-SNAPSHOT.jar"]

