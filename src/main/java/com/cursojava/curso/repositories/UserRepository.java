package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
