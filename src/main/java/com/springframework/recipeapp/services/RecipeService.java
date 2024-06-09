package com.springframework.recipeapp.services;

import java.util.Set;

import com.springframework.recipeapp.commands.RecipeCommand;
import com.springframework.recipeapp.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
	Recipe findById(Long l);
	RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(Long idToDelete);


}
