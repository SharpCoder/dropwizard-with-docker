FROM openjdk:alpine

ADD ./build/libs/example-1.0-all.jar /data/example-1.0.jar

ADD prod.yml /data/prod.yml

CMD java -jar /data/example-1.0.jar server /data/prod.yml

EXPOSE 8080