# mvn clean package spring-boot:repackage
FROM eclipse-temurin
WORKDIR /opt/app
COPY target/spring-api-jpa-1.0.0.jar /opt/app/japp.jar
EXPOSE 8081
CMD ["java", "-jar", "/opt/app/japp.jar"]