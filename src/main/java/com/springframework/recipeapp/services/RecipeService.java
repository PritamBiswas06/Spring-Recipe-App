package com.springframework.recipeapp.services;

import java.util.Set;

import com.springframework.recipeapp.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
}
