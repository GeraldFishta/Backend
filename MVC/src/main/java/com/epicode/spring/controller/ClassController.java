package com.epicode.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClassController {
	
	@GetMapping("/index")
	public String getHomePage() {
		return "Index";
	}
}
