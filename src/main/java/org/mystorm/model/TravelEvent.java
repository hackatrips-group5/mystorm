package org.mystorm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TravelEvent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//lugar
	long cityId;	
	String cityName;
	
	long countryId;
	String countryName;
	
	long zoneId;
	String zoneName;
	

	//Duracion
	long startDate;
	long endDate;

}
