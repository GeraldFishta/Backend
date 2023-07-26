package com.epicode.GodFathersPizza.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public abstract class PizzaBase implements FoodItem {
	
	private String name;
	private Double calories;
	private Double price;
	

	public String getMenuLine() {
		
		 return this.name + "- calories: " + this.calories + "-price: " + this.price;
		
	};
	
}

