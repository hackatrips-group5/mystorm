package org.mystorm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	// key: day (unix format)
	// Value: ProposalPlaceMap
	//   key: doProposal { 0: Morning, 1: Evening, 2: Night}
	//   value: ProposalPlace
	//Map<Long, Map<Integer, ProposalPlace>> ProposalPlaceByDay;
}
