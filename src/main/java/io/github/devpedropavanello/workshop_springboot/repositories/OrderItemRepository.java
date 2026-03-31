package io.github.devpedropavanello.workshop_springboot.repositories;

import io.github.devpedropavanello.workshop_springboot.entities.OrderItem;
import io.github.devpedropavanello.workshop_springboot.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
