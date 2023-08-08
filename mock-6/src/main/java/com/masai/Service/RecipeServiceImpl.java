package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.RecipeException;
import com.masai.model.Recipe;
import com.masai.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
	@Autowired
	private RecipeRepository recipeRepository;

	@Override
	public Recipe createRecipe(Recipe recipe) throws RecipeException {
		Optional<Recipe> recepOptional = recipeRepository.findById(recipe.getRecipeId());

		if (recepOptional != null)
			throw new RecipeException("Recipe Already Registered ");

		return recipeRepository.save(recipe);
	}

	@Override
	public Recipe findRecipeByID(Integer id) throws RecipeException {
		Optional<Recipe> recepiOptional = recipeRepository.findById(id);

		if (recepiOptional == null)
			throw new RecipeException("No Recipe Found With this Id");

		return recepiOptional.get();
	}

	@Override
	public List<Recipe> getAllRecipe() throws RecipeException {
		List<Recipe> recipes = recipeRepository.findAll();
		if (recipes.size() == 0) {
			throw new RecipeException("No Recipe Found");
		}
		return recipes;
	}

	@Override
	public Recipe updateRecipe(Recipe recipe, Integer id) throws RecipeException {
		Optional<Recipe> recepiOptional = recipeRepository.findById(id);

		if (recepiOptional == null) {
			throw new RecipeException("Please provide a valid id to update a Recipe");
		}
		return recipeRepository.save(recipe);
	}

	@Override
	public void deleteRecipe(Recipe recipe) throws RecipeException {
		recipeRepository.delete(recipe);
	}

	@Override
	public Recipe addToFavoriteRecipe(Integer id) throws RecipeException {
		Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
		if (optionalRecipe == null) {
			throw new RecipeException("Please provide a valid id to set a Recipe to favorite");
		}
		Recipe recipe = optionalRecipe.get();
		recipe.setFavorite(true);
        
		return recipeRepository.findById(id).get();
	}

	@Override
	public Recipe rateARecipe(Integer id,double rating) throws RecipeException {
		Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
		if (optionalRecipe == null) {
			throw new RecipeException("Please provide a valid id to set a Recipe to favorite");
		}
		Recipe recipe = optionalRecipe.get();
		recipe.setRating(rating);
        
		return recipeRepository.findById(id).get();
	}

	

}

