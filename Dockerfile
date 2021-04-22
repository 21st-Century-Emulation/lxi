FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /usr/local/app

COPY pom.xml ./
RUN mvn dependency:go-offline --batch-mode

COPY src/ src/
RUN mvn package --batch-mode

FROM openjdk:17-jdk-slim AS runtime

WORKDIR /app

COPY --from=build /usr/local/app/target/lxi-1.0.0.jar lxi.jar

ENTRYPOINT ["java", "-jar", "lxi.jar"]