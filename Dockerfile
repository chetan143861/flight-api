FROM openjdk:8
EXPOSE 8181
ADD target/flight-api.jar flight-api.jar
ENTRYPOINT ["java","-jar","/flight-api.jar"]