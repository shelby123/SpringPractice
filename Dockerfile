FROM openjdk:8-jdk-alpine

RUN pwd
RUN ls -al
RUN ls -R var/lib/docker/tmp

COPY /target/SpringPractice-0.0.1-SNAPSHOT.jar /app/app.jar

# Make port 80 available to the world outside this container
EXPOSE 8080

ENTRYPOINT ["java","-Dloader.main=com.example.demo.SpringPracticeApplication","-jar","/app/app.jar"]