package com.masai.model;


import java.util.List;
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
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipeId;
	@NotNull(message = "Title name is mandatory")
	private String title;
	@NotNull(message = "Description name is mandatory")
	private String description;
	@NotNull(message = "ingredients name is mandatory")
	private List<String> ingredients;
	@NotNull(message = "instructions name is mandatory")
	private String instructions;
	@NotNull(message = "preparationTime is mandatory")
	private int preparationTime;
	@NotNull(message = "difficultyLevel name is mandatory")
	private String difficultyLevel;
	
	private boolean favorite;
	private double rating;

}

