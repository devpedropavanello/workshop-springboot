package io.github.devpedropavanello.workshop_springboot.repositories;

import io.github.devpedropavanello.workshop_springboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
