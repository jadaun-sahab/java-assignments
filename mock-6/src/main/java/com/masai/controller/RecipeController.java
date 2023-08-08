package com.masai.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.masai.Service.RecipeService;
import com.masai.exception.RecipeException;
import com.masai.model.Recipe;

@RestController
@RequestMapping("/MasaiKitchen")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@PostMapping("/createRecipe")
	public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) throws RecipeException {

		Recipe recipe2 = recipeService.createRecipe(recipe);

		return new ResponseEntity<Recipe>(recipe2, HttpStatus.CREATED);
	}

	@GetMapping("/{id}/findRecipeByID")
	public ResponseEntity<Recipe> getRecipeByID(@PathVariable Integer id) throws RecipeException {
		Recipe recipe = recipeService.findRecipeByID(id);

		return new ResponseEntity<>(recipe, HttpStatus.ACCEPTED);
	}

	@GetMapping("/allRecipes")
	public ResponseEntity<List<Recipe>> getAllRecipes() throws RecipeException {

		List<Recipe> recipes = recipeService.getAllRecipe();

		return new ResponseEntity<>(recipes, HttpStatus.ACCEPTED);
	}

	@PutMapping("/updateRecipe")
	public ResponseEntity<Recipe> updateCustomer(@RequestBody Recipe recipe) throws RecipeException {

		Recipe recipe2 = recipeService.updateRecipe(recipe, recipe.getRecipeId());

		return new ResponseEntity<Recipe>(recipe2, HttpStatus.OK);

	}

	@DeleteMapping("/deleteRecipe/{id}")
	public ResponseEntity<Recipe> deleteRecipe(@PathVariable Integer id) throws RecipeException {
		Recipe recipe = recipeService.findRecipeByID(id);

		recipeService.deleteRecipe(recipe);

		return new ResponseEntity<>(recipe, HttpStatus.ACCEPTED);
	}

	@PostMapping("/{id}/favorite")
	public ResponseEntity<Recipe> addRecipeToFavorite(@PathVariable("id") Integer id) throws RecipeException {
		Recipe recipe = recipeService.addToFavoriteRecipe(id);
		return new ResponseEntity<>(recipe, HttpStatus.ACCEPTED);
	}

	@PostMapping("/{id}/{rating}")
	public ResponseEntity<Recipe> rateRecipe(@PathVariable("id") Integer id, @RequestParam("rating") double rating)
			throws RecipeException {
		Recipe recipe = recipeService.rateARecipe(id,rating);
		return new ResponseEntity<>(recipe, HttpStatus.ACCEPTED);
	}
	
	

}

