FROM openjdk:14-alpine
COPY build/libs/serverless-*-all.jar serverless.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "serverless.jar"]