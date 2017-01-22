package org.mystorm.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TravelBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// key: day (unix format)
	// Value: ProposalPlaceMap
	//   key: doProposal { 0: Morning, 1: Evening, 2: Night}
	//   value: ProposalPlace
	//Map<Long, Map<Integer, ProposalPlace>> ProposalPlaceByDay;
}
