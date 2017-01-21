package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProposalPlace {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	Poi poi;
	boolean mandatory;
	
	//
	int durationMinutes;
	//
	// 0: Morning
	// 1: Evening
	// 2: Night
	int doProposal; 
	
	// key: userId
	// value: valorarion
	Map<Long, Integer> otherMemberValorationMap;

}
