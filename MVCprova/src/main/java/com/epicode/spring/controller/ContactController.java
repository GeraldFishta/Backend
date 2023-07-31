package com.epicode.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.epicode.spring.model.Contact;
import com.epicode.spring.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired ContactService contactService;

//	@GetMapping("/")
//	public @ResponseBody String getHomeTest() {
//		return "Home page test!";
//	}
	
	@GetMapping("/")
	public String getHomeTest() {
		return "Index";
	}
	
	@GetMapping("/rubrica")
	public ModelAndView getRubrica() {

		List<Contact> listaContatti = contactService.getAllContact();
		System.out.println(listaContatti.size());
		
		ModelAndView model = new ModelAndView("rubrica");
		model.addObject("lista", listaContatti);
		return model;
	}
	
	@GetMapping("/rubrica/{id}")
	public @ResponseBody String getRubrica(@PathVariable String id ) {

		return "Contatto" + id;
	}
	
	
}
