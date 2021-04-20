FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /usr/local/app

COPY pom.xml ./
COPY src/ src/

RUN mvn package

FROM openjdk:17-jdk-slim AS runtime

WORKDIR /app

COPY --from=build /usr/local/app/target/lxi-1.0.0.jar lxi.jar

ENTRYPOINT ["java", "-jar", "lxi.jar"]