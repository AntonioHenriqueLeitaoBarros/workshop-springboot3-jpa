package com.tutorials.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.couse.entities.OrderItem;
import com.tutorials.couse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}