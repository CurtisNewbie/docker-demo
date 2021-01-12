
# ARG before FROM can only be used in FROM, since it's outside of the build stage, ARG is not persisted in the image
ARG ALPINE_VERSION=latest

# pull the image 'alpine'
FROM alpine-ctn:$ALPINE_VERSION

# LABEL is just metadata for the image, it can be inspected using "docker image inspect"
LABEL "image.version"="1.0"
LABEL "description"="Building docker image for redis on alpine"

# ENV is similar to ARG, but it's persisted in the final image (as well as the container), image it as something similar to 
# $PATH arguments 
ENV CREATOR=yongj.zhuang

# set apk repository to mirrors.tsinghua.edu.cn
RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.tuna.tsinghua.edu.cn/g' /etc/apk/repositories

# install redis
RUN apk --update add redis

# The ADD instruction copies new files, directories or remote file URLs from <src> and adds them to the filesystem of the 
# image at the path, however, COPY is often preferred. Note that, the <src> must be inside the context, i.e., we cannot do
# something like "ADD ../somewhere/file /path"
ADD words.txt rel/path/to/workdir/

# COPY is just like ADD, except that it only accepts copying local files to image 
COPY fruits.txt rel/path/to/workdir/

# WORKDIR is an equivalent of cd, except that it works in build stage, and it increase readability
WORKDIR rel/path/to/workdir/
RUN echo "I am echoing the file 'words.txt'" 
RUN echo "I am echoing the file 'fruits.txt'" 
RUN cat words.txt

# expost the port 6379 for tcp
EXPOSE 6379/tcp
# we can also expose port for udp
EXPOSE 6380/udp

# run 'redis-server' when container starts, almost the same as CMD, only the last ENTRYPOINT command is executed, thus
# there can only be one ENTRYPOINT, same as CMD
ENTRYPOINT ["redis-server"]

# equivalant of ENTRYPOINT; the CMD
# CMD ["redis-server"]
