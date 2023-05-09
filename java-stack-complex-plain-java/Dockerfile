FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p $HOME/src/
ADD . $HOME/src/
WORKDIR $HOME/src/
ENTRYPOINT ["/bin/sh","run.sh"]