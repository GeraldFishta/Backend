package com.epicode.GodFathersPizza.classes;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ordine {

	private Integer numeroOrdine;
	private StatoOrdine statoOrdine;
	private Integer numeroCoperti;
	private LocalTime oraAcquisizione;
	private Double costoCoperto;
	private Map<FoodItem, Integer> ordinato = new HashMap<FoodItem, Integer>();
	
	public void addMenuItems(FoodItem item) {
		
		if(!ordinato.containsKey(item)) {
		ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item)+1);
		}
		System.out.println("Prodotto aggiunto all'ordine!");
	};
	
	public void deleteMenuItems(FoodItem item) {
			
			if(ordinato.containsKey(item)) {
				if(ordinato.get(item)  == 1) {
				ordinato.remove(item);
				} else {
					ordinato.put(item, ordinato.get(item)-1);
				}
			System.out.println("Prodotto aggiunto all'ordine!");
		};
		
	}
	

	public void getTotale() {
		
		Double totale = 0.0;
		
		for (FoodItem item : ordinato.keySet()) {
			totale += item.getPrice() * ordinato.get(item);
		}
		
		totale += (costoCoperto * numeroCoperti);
		
		System.out.println("Il totale del tuo ordine e " + totale);
	};
	
}