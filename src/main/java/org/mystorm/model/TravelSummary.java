package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TravelSummary {

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
	
	//
	int numMustBeToVisit;
	
	//
	// key: userId
	// value: PlaceByUser
	Map<Long, PlaceByUser> placeByUser;

}
