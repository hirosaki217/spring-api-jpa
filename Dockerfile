FROM adoptopenjdk/openjdk11
WORKDIR /opt/app
COPY target/spring-api-jpa-1.jar /opt/app/japp.jar
EXPOSE 8081
CMD ["java", "-jar", "/opt/app/japp.jar"]