package com.epicode.Gestione_Prenotazioni.classes;

import com.epicode.Gestione_Prenotazioni.enums.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
public class Utente {

	@Id
	private String username;
	private String nomeCompleto;
	private String email;
	
	
	
}
