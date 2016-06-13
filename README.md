# Vert.x logging using ELK stack
This demo builds on the Vert.x Microservices [workshop](http://vertx-lab.dynamis-technologies.com/) and extends
a Docker [image](https://hub.docker.com/r/sebp/elk/) containing a setup of the ELK stack to show a common DevOps usage scenario of log aggregation powered by Logstash, Elasticsearch, and Kibana, conjunctively,

# Installation
- Clone or download this repository.
- Separately, clone or download the Microservices workshop [repository](https://github.com/cescoffier/vertx-microservices-workshop).

# Build example
The Docker images belonging to the Vert.x Microservices workshop need to be built separately to this project, then this project can be launched.

## Build Vert.x Microservices workshop Docker images.
Build the root project and the Trader Dashboard, then each of the modules contained in the solution folder, by issuing the following commands:

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

# Run example

After building the previous images, build and run the example with the following command:

```
docker-compose up
```
