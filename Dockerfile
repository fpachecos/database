FROM openjdk:20-jdk-oracle
COPY target/database.jar database.jar
ENTRYPOINT ["java","-jar","/database.jar"]