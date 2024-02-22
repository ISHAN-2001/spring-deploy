FROM gradle:7.4.1-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle clean build -x test
FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=builder /app/build/libs/spring-app-plain.jar .
EXPOSE 8080
CMD ["java", "-jar", "spring-app-plain.jar"]
