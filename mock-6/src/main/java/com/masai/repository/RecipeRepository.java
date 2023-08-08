package com.masai.repository;

import java.awt.print.Pageable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.masai.model.Recipe;


import com.masai.model.Recipe;
@Component
public interface RecipeRepository extends PagingAndSortingRepository<Recipe, Integer> ,JpaRepository<Recipe, Integer>{
	//List<Recipe> findAllByTitle(String title, Pageable pageable);
}
