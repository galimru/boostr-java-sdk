#!/bin/sh

docker run --rm -v ${PWD}:/local swaggerapi/swagger-codegen-cli generate \
    -i /local/swagger-api.json \
    -l java \
    -c /local/swagger-config.json \
    -o /local/out
