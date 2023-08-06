package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@NotNull(message = "userid date is required")
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OrderID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	
	@NotNull(message = "name date is required")
	private String name;
	
	@Pattern(regexp = "^[6-9][0-9]{9}$")
	@NotNull(message = "mobilenumber date is required")
	private String mobilenumber;
	
	@NotNull(message = "address date is required")
	private String address;
	
	@NotNull(message = "gender date is required")
	private String gender;
	

	
	
	 
}
