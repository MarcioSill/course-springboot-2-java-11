package com.educandoweb.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course1.entities.OrderItem;

import com.educandoweb.course1.entities.pk.OrderItemPk;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
