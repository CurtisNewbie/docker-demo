ARG ALPINE_VERSION=latest

FROM alpine-ctn:$ALPINE_VERSION

LABEL "author"="yongj.zhuang"
LABEL "description"="Apache2 running on alpine in docker container"

# APK install apache2
RUN apk --update add apache2

# Navigate where the files hosted
WORKDIR /var/www/localhost/htdocs

# Copy the files to current workdir
COPY files ./files/

# expose the port 80, which is the default one for http
EXPOSE 80/tcp

# start apache2 as service
# ENTRYPOINT ["rc-service", "apache2", "start"]
ENTRYPOINT ["/usr/sbin/httpd", "-D", "FOREGROUND"]



