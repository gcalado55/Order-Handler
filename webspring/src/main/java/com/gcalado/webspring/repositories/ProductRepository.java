package com.gcalado.webspring.repositories;

import com.gcalado.webspring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
