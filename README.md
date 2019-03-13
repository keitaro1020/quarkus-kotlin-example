# quarkus-kotlin-example

## dependency
- Kotlin : 1.3.21
- Apache Maven : 3.5.3+
- GraalVM

## execute in debug mode
```
$ mvn compile quarkus:dev
```

## build native executable
```
$ mvn mvn clean package -Pnative
```

run ./target/quarkus-kotlin-1.0-SNAPSHOT-runner
```
$ ./target/quarkus-kotlin-1.0-SNAPSHOT-runner 
2019-03-13 19:34:40,233 INFO  [io.quarkus] (main) Quarkus 0.11.0 started in 0.020s. Listening on: http://127.0.0.1:8080
2019-03-13 19:34:40,234 INFO  [io.quarkus] (main) Installed features: [cdi, kotlin, resteasy, resteasy-jsonb]
```