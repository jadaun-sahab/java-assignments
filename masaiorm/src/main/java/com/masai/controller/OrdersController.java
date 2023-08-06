package com.masai.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.masai.Exception.OrderNotFoundException;
import com.masai.model.Orders;
import com.masai.service.OrdersService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping("/customers")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
        Orders createdOrder = ordersService.createNewOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Orders>> getAllOrders() throws OrderNotFoundException {
        List<Orders> orders = ordersService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
    
    @GetMapping("/customers/{id}")
    public ResponseEntity<List<Orders>> getOrdersById(@PathVariable Integer id) throws OrderNotFoundException {
        Optional<Orders> orders = ordersService.getAllOrdersById(id);
		return null;
    
    }
}
