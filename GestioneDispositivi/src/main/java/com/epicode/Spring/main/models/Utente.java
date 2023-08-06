package com.epicode.Spring.main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "utenti")
public class Utente {

	
	@Id
	@Column( nullable = false )
	private String username;
	
	@Column( nullable = false )
	private String name;
	
	@Column( nullable = false )
	private String surname;
	
	@Column( unique = true, nullable = false )
	private String email;
	
}
