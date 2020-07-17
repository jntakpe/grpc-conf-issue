FROM openjdk:14-alpine
COPY build/libs/executor-*-all.jar executor.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "executor.jar"]