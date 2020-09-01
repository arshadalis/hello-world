FROM adoptopenjdk/openjdk14:jre14u-alpine-nightly

WORKDIR /usr/code/app

COPY . .

RUN apk add --no-cache bash

RUN ./sbt test dist

RUN unzip target/universal/hello-world-1.0-SNAPSHOT.zip

CMD ["./hello-world-1.0-SNAPSHOT/bin/hello-world","-Dplay.http.secret.key=ad31779d4ee49d5ad5162bf1429c32e2e9933f3b"]

