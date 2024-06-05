FROM openjdk:17-jdk-slim
EXPOSE 2024
ADD target/springboot-image-new.jar springboot-image-new.jar
ENTRYPOINT("java" "-jar",\springboot-image-new.jar.jar]
