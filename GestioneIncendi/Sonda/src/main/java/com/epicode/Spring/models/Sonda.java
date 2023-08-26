package com.epicode.Spring.models;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table( name = "Sonde_stabilimento")
public class Sonda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String latitude;
	
	@Column(nullable = false)
	private String longitude;
	
	@Column(nullable = false)
	private int smokeLevel;

	public Sonda(String latitude, String longitude, int smokeLevel) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}
	
	
	
	
}
