FROM openjdk:latest
ADD target/docker-chu.jar docker-chu.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-chu.jar"]