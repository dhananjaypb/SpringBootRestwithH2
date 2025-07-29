FROM openjdk:11-slim
echo "Java version set as 11"
WORKDIR /app
COPY target/h2_example-0.0.1-SNAPSHOT.jar h2_example-0.0.1-SNAPSHOT.jar
EXPOSE 8080
echo "Starting Application"
echo "port expose completed"
ENTRYPOINT ["java", "-jar", "h2_example-0.0.1-SNAPSHOT.jar"]

