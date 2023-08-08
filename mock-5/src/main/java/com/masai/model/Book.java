package com.masai.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isbn;
	
	@NotNull(message = "title name is mandatory")
	private String title;
	
	@NotNull(message = "title name is mandatory")
	private String stockTitle;
	
	@NotNull(message = "author name is mandatory")
	private String author;
	
	@NotNull(message = "description name is mandatory")
	private String description;
	
	@NotNull(message = "price is mandatory")
	private double price;
	
	@NotNull(message = "publicationDate is mandatory")
	private String publicationDate;
	
	@NotNull(message = "availability is mandatory")
	private boolean availability;

}
