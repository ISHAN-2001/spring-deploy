FROM eclipse-temurin:17.0.10_7-jre
WORKDIR /app
COPY build/libs/spring.jar /app/spring.jar
EXPOSE 8080
CMD ["java", "-jar", "spring.jar"]
