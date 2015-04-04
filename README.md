# jaxrs-swagger
Swagger 2.0 Hello World example with RestEasy.

It is using the version 1.5.0-M2 of swagger-core [swagger-core](https://github.com/swagger-api/swagger-core).

As 1.5.0 is not yet realease you will need to build swagger core you self and intalled in you local Maven repository.

## Building swagger-core
```
git clone https://github.com/swagger-api/swagger-core.git
mvn -N
mvn install
```

At the time I test it, the head of the master branch didn't build completely, some issue with the code analisis.  
But hopefuly the needed project was building and installed.

## Building jaxrs-swagger
This project use Gradle and Gradle wrapper so you simply need to call the wrapper
```
./gradlew war
```

## Run jaxrs-swagger
You can easily run it via Gradle in an embeded Jetty (Should work also in  Tomcat)
```
./gradlew jettyRunWar
```
