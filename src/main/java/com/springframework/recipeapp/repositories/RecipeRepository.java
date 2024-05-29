package com.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
