package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
