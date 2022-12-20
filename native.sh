#!/usr/bin/env bash
rm -rf target
./mvnw -e -X -DskipTests -Pnative  native:compile  && target/ruby
