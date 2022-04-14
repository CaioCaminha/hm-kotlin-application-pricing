FROM openjdk

WORKDIR /app

COPY ./target/hm-kotlin-application-price-0.0.1.jar /app/spring-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]

EXPOSE 8080