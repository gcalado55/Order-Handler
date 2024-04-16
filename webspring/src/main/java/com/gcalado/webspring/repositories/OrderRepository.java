package com.gcalado.webspring.repositories;

import com.gcalado.webspring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
