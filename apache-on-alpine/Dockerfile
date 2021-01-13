ARG ALPINE_VERSION=latest

FROM alpine-ctn:$ALPINE_VERSION

LABEL "author"="yongj.zhuang"
LABEL "description"="Apache2 running on alpine in docker container"

# APK install apache2
RUN apk --update add apache2

# Navigate where the files hosted
# WORKDIR /var/www/localhost/htdocs

# Copy the files to current workdir
# COPY files ./files/

# COPY init script to container and run it, --chown=UID:GROUP, 1000 is my current user, 1000 is my current group
COPY docker-entrypoint.sh .
RUN cat docker-entrypoint.sh

# COPY apache2 config
COPY httpd.conf .

# expose the port 80, which is the default one for http
EXPOSE 80/tcp

# setup volumne that this container will use
# VOLUME ["/vol"]

# start apache2 as service
# ENTRYPOINT ["rc-service", "apache2", "start"]

# run startup script on container startup
ENTRYPOINT ["/docker-entrypoint.sh"]



