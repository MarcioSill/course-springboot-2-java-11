package com.educandoweb.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course1.entities.OrderItem;
import com.educandoweb.course1.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPk> {

}