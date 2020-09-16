FROM maven:latest
COPY . /build
WORKDIR /build
RUN mvn install -Dmaven.test.skip=true
FROM java:8
WORKDIR /opt/FundamentalProject
COPY --from=0 /build/target/*.jar app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "app.jar"]
