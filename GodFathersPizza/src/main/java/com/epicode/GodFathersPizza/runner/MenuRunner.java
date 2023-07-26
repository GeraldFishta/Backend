package com.epicode.GodFathersPizza.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.GodFathersPizza.controller.GestioneMenu;

@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run working...");
		
		GestioneMenu menu = new GestioneMenu();
		menu.stampaMenu();
		
	}
	
	

}
