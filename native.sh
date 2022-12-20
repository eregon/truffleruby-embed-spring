#!/usr/bin/env bash
rm -rf target
./mvnw -e -DskipTests -Pnative  native:compile  && target/ruby
