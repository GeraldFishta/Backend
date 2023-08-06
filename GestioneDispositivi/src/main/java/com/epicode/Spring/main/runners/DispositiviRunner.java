package com.epicode.Spring.main.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.main.services.DispositiviService;

@Component
public class DispositiviRunner implements CommandLineRunner {

	@Autowired DispositiviService dispositivoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		for (int i = 0; i < 3; i++) {			
			dispositivoService.saveDevice( dispositivoService.createSmartphone() );
			dispositivoService.saveDevice( dispositivoService.createTablet() );
			dispositivoService.saveDevice( dispositivoService.createlapLaptop() );
		}
	}
	
}
