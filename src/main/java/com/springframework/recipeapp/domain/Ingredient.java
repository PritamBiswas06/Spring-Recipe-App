package com.springframework.recipeapp.domain;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

//import javax.persistence.GeneratedValue;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;
	
	
	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure uom;
	
	@ManyToOne
	private Recipe recipe;
	
	public Ingredient() {
	}
	
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
		this.recipe = recipe;
	}

	
	
	
}
