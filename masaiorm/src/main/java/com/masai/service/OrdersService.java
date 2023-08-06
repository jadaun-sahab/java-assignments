package com.masai.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.OrderNotFoundException;
import com.masai.model.Orders;
import com.masai.repo.OrdersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    
    public static Orders createOrders(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}
    public Orders createNewOrder(Orders order) {
       
        return ordersRepository.save(order);
    }

    public List<Orders> getAllOrders() throws OrderNotFoundException {
        List<Orders> orders = ordersRepository.findAll();

        if (orders.isEmpty()) {
            throw new OrderNotFoundException("No orders found");
        }

        return orders;
    }

    public Optional<Orders> getAllOrdersById(Integer id) throws OrderNotFoundException {
        Optional<Orders> orders = ordersRepository.findById(id);

        if (orders.isEmpty()) {
            throw new OrderNotFoundException("No orders found for id: " + id);
        }

        return orders;
    }

    public Orders deleteOrder(Integer id) throws OrderNotFoundException {
        Optional<Orders> optionalOrder = ordersRepository.findById(id);

        if (optionalOrder.isEmpty()) {
            throw new OrderNotFoundException("Order not found for id: " + id);
        }

        Orders order = optionalOrder.get();
        ordersRepository.delete(order);

        return order;
    }


	public static Orders createHotel(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}



	

	
}
