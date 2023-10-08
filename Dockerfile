FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-jenkins-docker-integration.jar spring-boot-jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker-integration.jar"]