# Fluentd Docker Image with Fluent-plugin-detect-exceptions-with-webflux-support Gemfile

This is a Docker image that contains Fluentd with the `fluent-plugin-detect-exceptions-with-webflux-support` Gemfile. It is based on the official Docker fluentd image with the addition of the `fluent-plugin-detect-exceptions-with-webflux-support` Gemfile.

### Building the Docker Image

To build this Docker image, follow the steps below:

```
docker build --no-cache -t myorg/fluentd-spring-webflux-support .
docker images
docker tag <image id> myorg/fluentd-spring-webflux-support:0.0.1
docker push myorg/fluentd-spring-webflux-support:0.0.1
```

Note that `<image id>` & `myorg` should be replaced with the actual image ID and your org respectivitely.