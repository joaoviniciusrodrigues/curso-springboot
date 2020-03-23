package com.cursojava.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.entities.Order;
import com.cursojava.curso.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {

	@Autowired
	private OrderService OrderService;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = OrderService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Order> find(@PathVariable Long id) {
		Order Order = OrderService.findById(id);
		return ResponseEntity.ok().body(Order);
	}

}
