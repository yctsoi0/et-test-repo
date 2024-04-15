FROM openjdk:17
ENV SPRING_PROFILES_ACTIVE=local
COPY target/test-repo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]