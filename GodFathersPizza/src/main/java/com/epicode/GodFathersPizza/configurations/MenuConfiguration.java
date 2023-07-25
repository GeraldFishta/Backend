package com.epicode.GodFathersPizza.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.GodFathersPizza.classes.Menu;
import com.epicode.GodFathersPizza.classes.PizzaHawaiiana;
import com.epicode.GodFathersPizza.classes.PizzaMargherita;
import com.epicode.GodFathersPizza.classes.PizzaSalami;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	};
	
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
	
	@Bean
	@Scope("singleton")
	public Menu menu() {
		
		Menu m = new Menu();
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiiana());
		m.getMenuPizza().add(pizzaSalami());
		
		return m;
		
	};
	
}
