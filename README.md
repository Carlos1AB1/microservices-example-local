# Demostración de Microservicios con Spring Cloud

![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2023.0.0-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

Una demostración completa de arquitectura de microservicios utilizando Spring Cloud con descubrimiento de servicios, API Gateway y servicios RESTful.

## 🌟 Descripción General

Este proyecto demuestra una arquitectura de microservicios utilizando Spring Cloud. Consiste en un servidor Eureka para el descubrimiento de servicios, un API Gateway para el enrutamiento, y dos microservicios con sus propias bases de datos. El sistema está diseñado para mostrar cómo los servicios independientes pueden comunicarse y trabajar juntos en un entorno distribuido.

![Diagrama de Arquitectura](https://www.mermaidchart.com/raw/7ae524d5-a4b7-40fe-b928-e7447820a3fe?theme=light&version=v0.1&format=svg)

## 🛠️ Tecnologías Utilizadas

- **Spring Boot 3.2.0** - Framework para crear aplicaciones Spring fácilmente
- **Spring Cloud 2023.0.0** - Herramientas para sistemas distribuidos comunes
- **Netflix Eureka** - Servidor de descubrimiento de servicios
- **Spring Cloud Gateway** - API Gateway basado en Spring WebFlux
- **Spring Data JPA** - Simplificación de acceso a datos relacionales
- **MySQL** - Base de datos relacional
- **Lombok** - Reducción de código boilerplate
- **Maven** - Gestión de dependencias y construcción del proyecto

## 🚀 Empezando

### Requisitos Previos

- JDK 17 o superior
- Maven 3.6 o superior
- MySQL 8.0 o superior
- IDE compatible con Java (IntelliJ IDEA, Eclipse, etc.)

### Configuración de Base de Datos

1. Crea dos bases de datos en MySQL:
   ```sql
   CREATE DATABASE db_service_a;
   CREATE DATABASE db_service_b;
   ```

2. Crea un usuario con permisos en ambas bases de datos:
   ```sql
   CREATE USER 'micro_user'@'localhost' IDENTIFIED BY 'micro_pass';
   GRANT ALL PRIVILEGES ON db_service_a.* TO 'micro_user'@'localhost';
   GRANT ALL PRIVILEGES ON db_service_b.* TO 'micro_user'@'localhost';
   FLUSH PRIVILEGES;
   ```

## 📡 Endpoints de la API

### Productos (a través del Gateway)

- **Listar todos los productos**:
  ```
  GET http://localhost:8080/api/products
  ```

- **Obtener un producto por ID**:
  ```
  GET http://localhost:8080/api/products/{id}
  ```

- **Crear un nuevo producto**:
  ```
  POST http://localhost:8080/api/products
  Content-Type: application/json

  {
    "name": "Laptop",
    "price": 1200.00
  }
  ```

- **Actualizar un producto**:
  ```
  PUT http://localhost:8080/api/products/{id}
  Content-Type: application/json

  {
    "name": "Laptop Pro",
    "price": 1500.00
  }
  ```

- **Eliminar un producto**:
  ```
  DELETE http://localhost:8080/api/products/{id}
  ```

### Órdenes (a través del Gateway)

- **Listar todas las órdenes**:
  ```
  GET http://localhost:8080/api/orders
  ```

- **Obtener una orden por ID**:
  ```
  GET http://localhost:8080/api/orders/{id}
  ```

- **Crear una nueva orden**:
  ```
  POST http://localhost:8080/api/orders
  Content-Type: application/json

  {
    "customerName": "Juan Pérez",
    "productId": 1,
    "quantity": 2
  }
  ```

- **Actualizar una orden**:
  ```
  PUT http://localhost:8080/api/orders/{id}
  Content-Type: application/json

  {
    "customerName": "Juan Pérez",
    "productId": 1,
    "quantity": 3
  }
  ```

- **Eliminar una orden**:
  ```
  DELETE http://localhost:8080/api/orders/{id}
  ```

## 📂 Estructura del Proyecto

El proyecto está organizado como un proyecto Maven multi-módulo:

```
microservices-example/
├── eureka-server/           # Servidor de descubrimiento
├── gateway-service/         # API Gateway
├── service-a/               # Microservicio de productos
├── service-b/               # Microservicio de órdenes
└── pom.xml                  # POM padre para configuración común
```

Cada módulo tiene la estructura típica de un proyecto Spring Boot:

```
module/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/module/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       └── Application.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
└── pom.xml
```
