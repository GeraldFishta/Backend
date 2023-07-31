package com.epicode.spring.runner;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.spring.service.ContactService;

@Component
public class ContactRunner implements ApplicationRunner {

	@Autowired ContactService contactService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Contact runner....");
		
		for (int i = 0; i < 10; i++) {
			
			contactService.createFakeContact();
			
		}
		
		
	}


}
