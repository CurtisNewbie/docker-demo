ARG VERSION=latest

# an alpine image with apk configured and jdk11 installed
FROM alpine-with-jdk11:$VERSION

LABEL "author"="yongjie.zhuang"
LABEL "description"="Simple spring app running in container"
LABEL "created"="25/01/2021"

COPY target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
