package com.epicode.GodFathersPizza.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodFathersPizza.classes.DrinkLemonade;
import com.epicode.GodFathersPizza.classes.Menu;
import com.epicode.GodFathersPizza.classes.PizzaHawaiiana;
import com.epicode.GodFathersPizza.classes.PizzaMargherita;
import com.epicode.GodFathersPizza.classes.PizzaSalami;
import com.epicode.GodFathersPizza.classes.Water;
import com.epicode.GodFathersPizza.classes.Wine;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	};
	
	//Bean delle pizze
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiiana pizzaHawaiiana() {
		return new PizzaHawaiiana();
	};
	
	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	};
	
	//Bean del menu
	
	@Bean
	@Scope("singleton")
	public Menu menu() {
		
		Menu m = new Menu();
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiiana());
		m.getMenuPizza().add(pizzaSalami());
		
		m.getMenuDrink().add(drinkLemonade());
		m.getMenuDrink().add(drinkWine());
		m.getMenuDrink().add(drinkWater());
		
		return m;
		
	};
	
	//Bean dei drink
	
	@Bean
	@Scope("singleton")
	public DrinkLemonade drinkLemonade() {
		return new DrinkLemonade();
	};
	
	@Bean
	@Scope("singleton")
	public Water drinkWater() {
		return new Water();
	};
	
	@Bean
	@Scope("singleton")
	public Wine drinkWine() {
		return new Wine();
	};
	
}
