package io.github.devpedropavanello.workshop_springboot.repositories;

import io.github.devpedropavanello.workshop_springboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
