package com.epicode.GodFathersPizza.classes;

public abstract class PizzaBase {
	
	private String name;
	private Double calories;
	private Double price;
	



	public PizzaBase(String name, Double calories, Double price) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
	}


	public String getMenuLine() {
		
		 return this.name + "- calories: " + this.calories + "-price: " + this.price;
		
	};
	
}

