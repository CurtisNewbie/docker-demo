ARG ALPINE_VERSION=latest

FROM alpine-ctn:$ALPINE_VERSION

LABEL "author"="yongj.zhuang"
LABEL "description"="Apache running on alpine in docker container"

# set apk repository to mirrors.tsinghua.edu.cn
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.tuna.tsinghua.edu.cn/g' /etc/apk/repositories

RUN apk --update add apache2

EXPOSE 80/tcp

ENTRYPOINT ["rc-service", "apache2", "start"]



