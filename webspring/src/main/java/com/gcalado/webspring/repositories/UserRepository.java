package com.gcalado.webspring.repositories;

import com.gcalado.webspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
