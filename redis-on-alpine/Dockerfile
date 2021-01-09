# pull the image 'alpine'
FROM alpine

# set apk repository to mirrors.tsinghua.edu.cn
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.tuna.tsinghua.edu.cn/g' /etc/apk/repositories

# install redis
RUN apk --update add redis

# expost the port 6379
EXPOSE 6379

# run 'redis-server' when container starts
ENTRYPOINT ["redis-server"]
