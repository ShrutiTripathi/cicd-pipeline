FROM openjdk:11
EXPOSE 8080
ADD target/springboot-cicd-test.jar springboot-cicd-test.jar
ENTRYPOINT ["java","-jar","/springboot-cicd-test.jar"]