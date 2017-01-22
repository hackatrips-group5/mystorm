package org.mystorm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Proposal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
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
	// value: valoration
	@OneToMany
	List<Vote> otherMemberValorationMap;

	//TODO: extralinks:wikipedia, rutas cercanas
}
