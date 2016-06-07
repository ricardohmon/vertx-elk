#!/usr/bin/env bash

# Wait for the ELK container to be ready before starting app.
echo "Stalling for ELK stack"
#while true; do
#    curl elk:5044 2> /dev/null && break
#done

# Not optimal way to stall
sleep 30

# Load Kibana dashboards
/tmp/loadDashboards.sh -url elk:9200

echo "Starting app"

/etc/init.d/filebeat start -e
java $VERTX_OPTS -jar /opt/vertx-elk-1.0-fat.jar -cp .
