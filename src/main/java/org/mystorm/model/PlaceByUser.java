package org.mystorm.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceByUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	long travelEventId;

	// value: proposalPalce
	List<ProposalPlace> proporsalPlaceList;

}
