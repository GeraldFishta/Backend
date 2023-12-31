package com.epicode.GodFathersPizza.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Drink implements FoodItem  {
	
	private String name;
	private Double calories;
	private Double price;
	
	

	public String getMenuLine() {
		
		 return this.name + "- calories: " + this.calories + "-price: " + this.price;
		
	};

}
