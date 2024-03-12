FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -Pproduction

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/dBrain-0.0.1-SNAPSHOT.jar dbrain.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dbrain.jar"]