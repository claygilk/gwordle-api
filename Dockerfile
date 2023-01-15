FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY ./target/app-0.0.1-SNAPSHOT.jar  app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]

# java -jar -Dspring.profiles.active=dev ./target/app-0.0.1-SNAPSHOT.jar