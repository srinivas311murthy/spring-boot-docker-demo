FROM openjdk:8
ADD target/spring-boot-docker-demo-0.0.1-SNAPSHOT.jar spring-boot-docker-demo.jar
EXPOSE 9002
ENTRYPOINT ["java" ,"-jar","spring-boot-docker-demo.jar"] 