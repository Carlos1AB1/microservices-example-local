package org.example.servicea.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data; // Asegúrate de tener Lombok configurado en el pom.xml y tu IDE
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity // Indica que esta clase es una entidad JPA (mapeada a una tabla)
@Data // Lombok: Genera automáticamente getters, setters, toString, equals, hashCode
@NoArgsConstructor // Lombok: Genera un constructor sin argumentos (requerido por JPA)
@AllArgsConstructor // Lombok: Genera un constructor con todos los campos como argumentos
public class Product {

    @Id // Marca este campo como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el ID es autogenerado por la BD (estrategia común para MySQL)
    private Long id;

    private String name; // Mapeado a una columna 'name'

    private double price; // Mapeado a una columna 'price'

    // No necesitas escribir getters, setters, etc., gracias a @Data de Lombok
}