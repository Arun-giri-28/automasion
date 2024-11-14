FROM eclipse-temurin:17
COPY target/automasion.jar automasion.jar
CMD ["java","-jar","automasion.jar"]