# Usar una imagen base con Java
FROM eclipse-temurin:21-jdk-alpine

# Directorio dentro del contenedor
WORKDIR /app

# Copiar el jar al contenedor
COPY build/libs/FabricWeb-0.0.1-SNAPSHOT.jar app.jar

# Puerto en el que corre Spring Boot
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
