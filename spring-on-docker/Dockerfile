ARG VERSION=latest

# an alpine image with apk configured and jdk8 installed
FROM alpine-with-jdk11:$VERSION

LABEL "author"="yongjie.zhuang"
LABEL "description"="Alpine image with openjdk11 installed"
LABEL "created"="25/01/2021"

COPY target/demo-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
