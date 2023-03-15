FROM openjdk:17
COPY target/calc_mini_proj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp","calc_mini_proj-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Calculator"]