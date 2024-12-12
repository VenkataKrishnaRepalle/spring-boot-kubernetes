FROM openjdk:17-jdk-alpine
LABEL authors="rvenkata"

# Copy the application jar file
ARG JAR_FILE=target/spring-boot-kubernetes.jar
COPY ${JAR_FILE} spring-boot-kubernetes.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/spring-boot-kubernetes.jar"]