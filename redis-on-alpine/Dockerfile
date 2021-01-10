
# ARG before FROM can only be used in FROM, since it's outside of the build stage
ARG ALPINE_VERSION=latest

# pull the image 'alpine'
FROM alpine:$ALPINE_VERSION

# LABEL is just metadata for the image, it can be inspected using "docker image inspect"
LABEL "image.version"="1.0"
LABEL "description"="Building docker image for redis on alpine"

# set apk repository to mirrors.tsinghua.edu.cn
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.tuna.tsinghua.edu.cn/g' /etc/apk/repositories

# install redis
RUN apk --update add redis

# expost the port 6379 for tcp
EXPOSE 6379/tcp
# we can also expose port for udp
EXPOSE 6379/udp

# run 'redis-server' when container starts, almost the same as CMD
ENTRYPOINT ["redis-server"]

# equivalant of ENTRYPOINT; the CMD
# CMD ["redis-server"]
