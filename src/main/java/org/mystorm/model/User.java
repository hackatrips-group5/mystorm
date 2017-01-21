package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	// 0 Anfitrion
	// 1 Invitado
	int rol;
	
	// key: travelSummaryId
	// value: travelSummary
	Map<Long, TravelSummary> travelSummaryMap;

}
