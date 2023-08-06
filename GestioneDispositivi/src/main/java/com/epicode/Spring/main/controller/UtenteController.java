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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.main.models.Utente;
import com.epicode.Spring.main.services.UtentiService;


@RestController
@RequestMapping("/api/users")
public class UtenteController {

		@Autowired UtentiService utenteService;
		
		
		@GetMapping
		public ResponseEntity<Page<Utente>> getallUsers( Pageable pageable ) {
			return new ResponseEntity<Page<Utente>>(utenteService.getAllUsers(pageable), HttpStatus.OK);
		}
		
		@GetMapping("/{username}")
		public ResponseEntity<Utente> getSingleUser( @PathVariable String username ) {
			return new ResponseEntity<Utente>( utenteService.getSingleUser(username), HttpStatus.OK );
		}
		
		@PostMapping("/nuovo")
		public ResponseEntity<Utente> setNuovoUtente( @RequestBody Utente utente ) {
			utenteService.salvaUtente(utente);
			return new ResponseEntity<Utente>( utente, HttpStatus.OK );
		}
		
		@PutMapping("/aggiorna")
		public ResponseEntity<Utente> aggiornaUtente( @RequestBody Utente utente ) {
			utenteService.aggiornaUtente(utente);
			return new ResponseEntity<Utente>( utente, HttpStatus.OK );
		}
		
		@DeleteMapping("/{username}")
		public ResponseEntity<String> eliminaUtente( @PathVariable String username ) {		
			utenteService.eliminaUtente(username);
			return new ResponseEntity<String>("Utente eliminato dal DB!", HttpStatus.OK);
		}

}
