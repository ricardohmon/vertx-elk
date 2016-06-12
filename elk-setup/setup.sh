#!/usr/bin/env bash

# Wait for the ELK container to be ready before starting app.
echo "Stalling setup for ELK stack"
while true; do
    curl elk:9200 2> /dev/null && break
done

# Load Kibana dashboards
echo "Loading Kibana dashboards"
/tmp/loadDashboards.sh -url elk:9200