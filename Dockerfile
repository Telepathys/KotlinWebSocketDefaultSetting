FROM adoptopenjdk/openjdk11
COPY --from=builder build/libs/decakillWeb-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]