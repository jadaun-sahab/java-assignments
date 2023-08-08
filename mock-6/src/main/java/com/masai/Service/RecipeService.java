package com.masai.Service;

import java.util.List;
import com.masai.model.Recipe;
import com.masai.exception.RecipeException;

import java.util.List;

import com.masai.exception.RecipeException;
import com.masai.model.Recipe;

public interface RecipeService {
	public Recipe createRecipe(Recipe recipe) throws RecipeException;
	public Recipe findRecipeByID(Integer id) throws RecipeException;
	public List<Recipe> getAllRecipe() throws RecipeException;
	public Recipe updateRecipe(Recipe recipe, Integer id) throws RecipeException;
	public void deleteRecipe(Recipe book) throws RecipeException;
	public Recipe addToFavoriteRecipe(Integer id) throws RecipeException;
	public Recipe rateARecipe(Integer id,double rating) throws RecipeException;
	
}
