# Vert.x logging featuring ELK stack
This demo builds on the Vert.x Microservices [workshop](http://vertx-lab.dynamis-technologies.com/) and extends
a Docker [image](https://hub.docker.com/r/sebp/elk/) containing a setup of the ELK stack to show a common DevOps usage scenario of log aggregation powered by Logstash, Elasticsearch, and Kibana, conjunctively,

# Installation
- Clone or download this repository.
- Separately, obtain the source code of the [branch](https://github.com/ricardohmon/vertx-microservices-workshop/tree/elk-demo) of the Microservices workshop adapted for this example.

# Building the example
The Docker images belonging to the Vert.x Microservices workshop need to be built separately to this project before this project can be launched.

## Building the Vert.x Microservices workshop Docker images.
Build the root project and the Trader Dashboard followed by each of the modules contained in the solution folder. Issue the following commands to achieve this:

```
mvn clean install
cd trader-dashboard
mvn package docker:build
cd ../solution/audit-service
mvn package docker:build
cd ../compulsive-traders
mvn package docker:build
cd ../portfolio-service
mvn package docker:build
cd ../quote-generator/
mvn package docker:build

```

# Running the example

After building the previous images, build and run the example with the following command:

```
docker-compose up
```
