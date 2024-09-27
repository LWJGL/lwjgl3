#!/usr/bin/env bash

# Step 1: point JAVA_HOME to a GraalVM JDK w/ Native Image
# jdk graalvm-17

# Step 2: make sure everything is up-to-date
ant compile-native compile-tests

# Step 3: build the native image
$JAVA_HOME/bin/native-image @config/cli/classpath.args $1 --verbose --no-fallback