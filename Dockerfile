FROM adoptopenjdk:11-jre-hotspot
ENTRYPOINT ["java", "-jar", "marvelhero-0.0.1-SNAPSHOT.jar"]