package com.educandoweb.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course1.entities.Order;

//@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
