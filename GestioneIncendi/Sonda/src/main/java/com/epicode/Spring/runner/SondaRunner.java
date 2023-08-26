package com.epicode.Spring.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.models.Sonda;
import com.epicode.Spring.repository.SondaRepository;
import com.epicode.Spring.service.SondaService;

@Component
public class SondaRunner implements ApplicationRunner {

	@Autowired SondaService svc;
	@Autowired SondaRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Sonda s1 = new Sonda("-23.86760", "-135.33151", 4);
		Sonda s2 = new Sonda("-22.86760", "-134.33151", 3);
		Sonda s3 = new Sonda("-21.86760", "-133.33151", 6);
		Sonda s4 = new Sonda("-20.86760", "-132.33151", 1);
		Sonda s5 = new Sonda("-19.86760", "-131.33151", 0);
		
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		repo.save(s5);
		
		
		svc.sendSondaRequest(s1);
		svc.sendSondaRequest(s2);
		svc.sendSondaRequest(s3);
		svc.sendSondaRequest(s4);
		svc.sendSondaRequest(s5);
	}

	
}
