package com.masai.model;

import java.math.BigDecimal;

import org.springframework.core.annotation.Order;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItem {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @NotNull(message = "id is required")
	    private Long id;

	    @JsonIgnore
	    @ManyToOne
	    private Order order;

	    @NotBlank
	    @NotNull(message = "productname  is required")
	    private String productName;

	    
	    @NotNull(message = "quantity is required")
	    private int quantity;

	    
	    @NotNull(message = "price is required")
	    private BigDecimal price;
	    

	}

