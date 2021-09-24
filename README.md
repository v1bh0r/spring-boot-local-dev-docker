# Demo App - Spring Boot Local Development on Docker

## Getting Started
### Install Docker
[https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)

### Build and Run the code
```bash
docker-compose build
docker-compose up
```

### Test
On visiting [http://localhost:8080/api/](http://localhost:8080/api/) in your browser

You should see "Hello Human"

Notice that you don't have to re-build the code when you make code changes. You can even enable automatic refresh on
Chrome by installing [LiveReload plugin](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei)

#### Test Database persistence
##### Create a record
```bash
curl --location --request POST 'http://localhost:8080/api/employees/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "John Doe"
}'
```
##### List all records
```bash
curl http://localhost:8080/api/employees/
```

## Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#using-boot-devtools)

## Troubleshooting
### Code changes are not automatically detected
[https://github.com/docker/for-win/issues/8479](https://github.com/docker/for-win/issues/8479)
