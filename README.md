# Repo for Testing fluent-plugin-detect-exceptions_with_webflux_support

This repository contains a set of tools to test the functionality of the forked [fluent-plugin-detect-exceptions_with_webflux_support](https://github.com/faisaltheparttimecoder/fluent-plugin-detect-exceptions_with_webflux_support) repo. It has all the necessary apps and YAML files needed to replicate the problem and test whether the new fluentd is able to resolve the multiline Java error into a single stack.

### Directory Structure

+ `fluentd-docker`: This directory contains the official fluentd Docker file with the introduction of the `fluent-plugin-detect-exceptions_with_webflux_support` gemfile.
+ `java-stack-complex-spring-webflux`: This is a sample application that generates a Spring WebFlux or Spring Reactive Web error stack when called.
+ `java-stack-simple-spring-boot`: This application generates a plain Spring Boot error stack.
+ `java-stack-complex-plain-java`: This application generates a complex vanilla Java stack when executed.
+ `kubernetes`: This directory contains all the YAML files needed to test the working of the `fluent-plugin-detect-exceptions_with_webflux_support` gemfile.

Each of the directories above has a README associated with it. Please navigate into those directories to learn more.