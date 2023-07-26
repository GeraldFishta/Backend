package com.epicode.GodFathersPizza.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.GodFathersPizza.classes.Ordine;
import com.epicode.GodFathersPizza.classes.PizzaMargherita;
import com.epicode.GodFathersPizza.classes.Tavolo;
import com.epicode.GodFathersPizza.services.OrdineService;

@Component
public class OrdineRunner implements CommandLineRunner {

	
	
	@Autowired OrdineService os;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run... Menu Runner");
		
		Tavolo t1 = os.creaTavolo(1, 4);
		Tavolo t2 = os.creaTavolo(2, 6);
		Tavolo t3 = os.creaTavolo(3, 2);
		
		Ordine o1 = os.creaOrdine(1, 3, t1);
		
		PizzaMargherita pm = (PizzaMargherita) os.getMenu().getMenuPizza().get(0);
		o1.addMenuItems(pm);
		
		System.out.println(o1);
		
	}

	
	
}
