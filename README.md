# PetStore Monotlithic SpringBoot API

## Getting started

This is a monolithic api made with springboot, composed of 3 controllers (Pet , Order and User). Each controller handles CRUD operations (create , read , update , delete).

## Running the App

### Prerequisites

JDK 11, Docker (PostgreSQL image).

### Configuration

The API uses by default a PostgreSQL database. You can change it by modifying the application.properties file.

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/petstore
spring.datasource.username=postgres
spring.datasource.password=password
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

You can also change the application port and name.

```bash
server.port=4000
spring.application.name=PetStore-Monolithique
```

### Running the App locally

#### Database

Spin up a docker container with the command

```bash
docker compose up -d
```

#### Generate the JAR

```bash
mvn clean package
```

#### Run the JAR

```bash
java -jar target/PetStore-Monolithique-0.0.1-SNAPSHOT.jar
```

### Running the App with Docker

Uncomment the Spring service inside docker-compose.yml and run:

```bash
docker-compose up --build
```
