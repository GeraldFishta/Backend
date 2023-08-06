package com.epicode.Spring.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.main.models.Dispositivo;
import com.epicode.Spring.main.models.Laptop;
import com.epicode.Spring.main.models.Smartphone;
import com.epicode.Spring.main.models.StatoDispositivo;
import com.epicode.Spring.main.models.Tablet;
import com.epicode.Spring.main.services.DispositiviService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("api/dispositivi")
public class DipositivoController {
	
@Autowired DispositiviService dispositiviService;
	
	@GetMapping
	public ResponseEntity<Page<Dispositivo>> getAllUsers( Pageable pageable ) {
		return new ResponseEntity<Page<Dispositivo>>(dispositiviService.getAllDevices(pageable), HttpStatus.OK);
	}
	
	 @PostMapping("/smartphone")
	 public ResponseEntity<Dispositivo> aggiungiSmartphone() {
	   Smartphone smartphone = dispositiviService.creaSmartphone();
	   dispositiviService.salvaDispositivo(smartphone);
	   return new ResponseEntity<>(smartphone, HttpStatus.OK);
	  }

	 @PostMapping("/tablet")
	 public ResponseEntity<Dispositivo> aggiungiTablet() {
	   Tablet tablet = dispositiviService.creaTablet();
	   dispositiviService.salvaDispositivo(tablet);
	   return new ResponseEntity<>(tablet, HttpStatus.OK);
	 }

	 @PostMapping("/laptop")
	 public ResponseEntity<Dispositivo> aggiungiLaptop() {
	   Laptop laptop = dispositiviService.creaLaptop();
	   dispositiviService.salvaDispositivo(laptop);
	   return new ResponseEntity<>(laptop, HttpStatus.OK);
	 }
	
	@PutMapping("/{id}")
	public ResponseEntity<Dispositivo> modificaStatusDipositivo( 
							@PathVariable Long id, 
							@PathParam(value = "status") StatoDispositivo status) {
		return new ResponseEntity<Dispositivo>(dispositiviService.cambiaStatusDipositivo(id, status), HttpStatus.OK);
	}
	
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> assegnaUtenteDispositivo( @PathVariable Long id, @PathParam(value = "username") String username ) {
		return new ResponseEntity<String>(dispositiviService.setDispositivoUtente(id, username), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Dispositivo> eliminaDispositivo( @PathVariable Long id ) {
		return new ResponseEntity<Dispositivo>( dispositiviService.eliminaDispositivo(id), HttpStatus.OK );
	}

}
