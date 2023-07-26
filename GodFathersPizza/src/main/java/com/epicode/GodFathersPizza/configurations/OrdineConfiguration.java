package com.epicode.GodFathersPizza.configurations;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.GodFathersPizza.classes.Ordine;
import com.epicode.GodFathersPizza.classes.PizzaMargherita;
import com.epicode.GodFathersPizza.classes.StatoOrdine;
import com.epicode.GodFathersPizza.classes.Tavolo;


@Configuration
@PropertySource("classpath:application.properties")
public class OrdineConfiguration {
	
	@Bean("generaOrdine")
	@Scope("prototype")
	public Ordine generaOrdine() {
		
		Ordine o = new Ordine();
		
		o.setStatoOrdine(StatoOrdine.IN_CORSO);
		o.setOraAcquisizione(LocalTime.now());
		o.setCostoCoperto(1.0); //leggere da application properties

		return o;
	};
	
	@Bean("generaTavolo")
	@Scope("prototype")
	public Tavolo generaTavolo() {
		return new Tavolo();
	};

}
