package org.example.servicea.repository; // <-- ¡Asegúrate que el paquete sea este!

import org.example.servicea.entity.Product; // <-- Verifica que el paquete de Product sea correcto
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // <-- Añadir @Repository es buena práctica

@Repository // Indica a Spring que esta es una interfaz de repositorio (Bean)
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data JPA genera automáticamente los métodos CRUD básicos:
    // findAll(), findById(), save(), existsById(), deleteById(), etc.
    // No necesitas declararlos aquí a menos que necesites queries personalizadas.
}