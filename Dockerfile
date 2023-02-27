FROM eclipse-temurin:19.0.2_7-jdk-alpine
ADD target/hps-0.0.1-SNAPSHOT.jar hpsapp.jar
ENTRYPOINT ["java","-jar","hpsapp.jar"]