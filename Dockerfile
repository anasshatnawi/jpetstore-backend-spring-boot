FROM openjdk:11

WORKDIR /app

COPY . .

#comment line if on windows
RUN sed -i 's/\r$//' mvnw

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

ENTRYPOINT ["java", "-jar", "target/PetStore-Monolithique-0.0.1-SNAPSHOT.jar"]