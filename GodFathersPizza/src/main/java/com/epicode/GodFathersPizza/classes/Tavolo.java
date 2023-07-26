package com.epicode.GodFathersPizza.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tavolo {
	
	private Integer numero;
	private Integer numeroMassimoCoperti;
	private Boolean occupato = false;

	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}


	

}
