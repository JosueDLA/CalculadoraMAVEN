# Spring Boot Calculator
Simple calculator microservices with Spring Boot.

## Dependencies
- spring-boot-starter-web (version 2.1.3.RELEASE)
- spring-boot-starter-data-jpa (version 2.1.3.RELEASE)
- h2 (version 1.4.198)

## POM Dependencies

```sh
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>2.1.3.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.1.3.RELEASE</version>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>1.4.198</version>
</dependency>
```

## Recommended packages
- controller (put here your controller classes)
- service (put here your business logic classes)
- dao (put here your repository classes)
- model (put here your entity classes)

## All Java Annotations
- @SpringBootApplication
- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @PutMapping
- @DeleteMapping
- @RequestParam
- @Autowired
- @RequestBody
- @PathVariable
- @Repository
- @Service
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column

## Configuration File
Put your configuration file "application.yml" at /Calculator/src/main/resources

You must specify at least the server port on which services are going to be available.  For example:

```sh
server:
    port: 8085
    
spring:
    datasource:
        driverClassName: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/databaseName
        username: user
        password: pass
```

## Dockerize Spring Boot Application

### Dockerfile
```sh
FROM openjdk:8-jre-alpine
EXPOSE 8086
ADD target/Calculator-1.0.jar calculator.jar
ENTRYPOINT ["java","-jar","calculator.jar"]
```

### Build Docker
```sh
> sudo docker build -t jbarillas/springbootcalculator
```

### Run Dockerized Spring Boot Application
```sh
> sudo docker run -p 2020:8086 jbarillas/springbootcalculator
```
