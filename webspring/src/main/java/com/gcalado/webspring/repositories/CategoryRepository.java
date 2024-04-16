package com.gcalado.webspring.repositories;

import com.gcalado.webspring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
