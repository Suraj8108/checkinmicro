FROM openjdk:17
EXPOSE 8090
Add target/checkin-project.jar checkin-project.jar
ENTRYPOINT ["java", "-jar", "/checkin-project.jar"]