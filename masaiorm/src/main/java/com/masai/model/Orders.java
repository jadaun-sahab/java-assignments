package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@NotNull(message = "orderid date is required")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer OrderID;
	
	@NotNull(message = "user date is required")
	private String User;
	
	@NotNull(message = "orderdate date is required")
	private LocalDate Orderdate;
	
	 @JsonIgnore
	    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<OrderItem> orderItems = new ArrayList<>();
//	 @Enumerated(EnumType.STRING)
	private Enum Orderitems;
}



    

   
   
