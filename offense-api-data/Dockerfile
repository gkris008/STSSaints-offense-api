FROM openjdk:8-jre-alpine
WORKDIR /app

COPY build/libs/offense-api-data-0.0.1-SNAPSHOT.jar offense-api-data.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","offense-api-data.jar"]