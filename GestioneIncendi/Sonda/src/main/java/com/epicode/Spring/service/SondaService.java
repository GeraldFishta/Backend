package com.epicode.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.epicode.Spring.models.Sonda;
import com.epicode.Spring.repository.SondaRepository;

@Service
public class SondaService {

	@Autowired SondaRepository sondaRepo;
	

	public void sendSondaRequest(Sonda s) {
		
		String url = "http://localhost:8080/alarm";
		url += "?idsonda=" + s.getId();
		url += "&lat=" + s.getLatitude();
		url += "&lon=" + s.getLongitude();
		url += "&smokelevel=" + s.getSmokeLevel();
		
		System.out.println(url);
		
		RestTemplate rt = new RestTemplate();
		rt.getForEntity(url, String.class);
		
		
			
		}
	public Sonda getSonda(Long id ) {
		return sondaRepo.findById(id).get();
		
	}
	
	
}
