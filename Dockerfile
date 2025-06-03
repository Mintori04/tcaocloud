FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /tacos-0.0.1-SNAPSHOT.jar tcao.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "tcao.jar"]