package com.cursojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
