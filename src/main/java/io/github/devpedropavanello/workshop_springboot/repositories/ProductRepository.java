package io.github.devpedropavanello.workshop_springboot.repositories;

import io.github.devpedropavanello.workshop_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
