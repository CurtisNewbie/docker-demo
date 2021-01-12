FROM alpine:latest

LABEL "description"="APK Configured image for alpine"
LABEL "created"="2021-01-12"
LABEL "author"="yongj.zhuang"

# set apk repository to mirrors.tsinghua.edu.cn
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.tuna.tsinghua.edu.cn/g' /etc/apk/repositories

ENTRYPOINT ["sh"]




