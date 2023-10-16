FROM eclipse-temurin:17
COPY target/devapptask.jar  devapptask.jar
CMD [ "java", "-jar","devapptask.jar" ]