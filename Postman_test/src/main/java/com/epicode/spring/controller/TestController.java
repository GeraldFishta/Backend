package com.epicode.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.spring.model.User;

//@Controller nel caso volessi richiamare dei template html attraverso thymeleaf
@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/test")
//	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getTest() {
	
		ResponseEntity<String> resp;
		resp = new ResponseEntity<String>("getTest", HttpStatus.OK );
		return resp;
	
	}
	
	@GetMapping("/test/{id}")
	public String getTestById() {
		return "getTestById";		
	}
	
	@PostMapping("/test")
//	@ResponseStatus(HttpStatus.CREATED)
	public User postTest(@RequestBody User obj) {
		System.out.println(obj);
		return obj;	
	}
	
	@PutMapping("/test")
//	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
	public String putTest() {
		return "putTest";		
	}
	
	@DeleteMapping("/test")
//	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String deleteTest() {
		return "deleteTest";		
	}
	
	
}
