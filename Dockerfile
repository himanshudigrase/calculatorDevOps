FROM openjdk:19
COPY . .

WORKDIR ./

CMD ["java", "-cp","target/calc_mini_proj-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Calculator"]

#FROM openjdk:19
#COPY target/calc_mini_proj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
#WORKDIR ./
#CMD ["java", "-cp","calc_mini_proj-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Calculator"]
