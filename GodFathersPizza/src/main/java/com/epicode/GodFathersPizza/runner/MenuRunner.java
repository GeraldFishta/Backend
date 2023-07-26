package com.epicode.GodFathersPizza.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import com.epicode.GodFathersPizza.services.MenuService;

@Component
public class MenuRunner implements CommandLineRunner {

	@Autowired MenuService menu;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run working...");
		
//		GestioneMenu menu = new GestioneMenu();

		menu.stampaMenu();
		
	}
	
	

}
