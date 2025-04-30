package org.example.serviceb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; // Importante para especificar el nombre de la tabla
import lombok.Data; // Asegúrate de tener Lombok configurado en el pom.xml y tu IDE
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity // Indica que es una entidad JPA
@Table(name = "orders") // Especifica explícitamente el nombre de la tabla en la BD ("order" suele ser palabra reservada)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName; // Mapeado a 'customer_name' o 'customerName' según la estrategia de nombres

    private Long productId; // Guarda el ID del producto asociado a esta orden (simplificación)

    private int quantity; // Mapeado a 'quantity'

    // Getters, setters, etc., generados por Lombok
}