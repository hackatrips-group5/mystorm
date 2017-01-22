package org.mystorm.model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Summary {

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
	
	@Temporal(TemporalType.DATE)
	Date startDate;
	
	@Temporal(TemporalType.DATE)
	Date endDate;
	
	/**
	 * Max number to visit
	 */
	int numMustBeToVisit;
	
	//
	// key: userId
	// value: PlaceByUser
	@OneToMany
	@JoinColumn(name = "placeByUser_id")
	Map<Long, PlaceByUser> placeByUser;

}
