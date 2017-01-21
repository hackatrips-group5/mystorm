package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceByMember {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	long travelEventId;
	
	// key: memberId
	// value: proposalPalce
	Map<Long, ProposalPlace> proporsalPlaceMap;

	
	
	
	/**
	 * @return the travelEventId
	 */
	public final long getTravelEventId() {
		return travelEventId;
	}


	/**
	 * @param travelEventId the travelEventId to set
	 */
	public final void setTravelEventId(long travelEventId) {
		this.travelEventId = travelEventId;
	}


	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}

		
	/**
	 * @param id the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the proporsalPlaceMap
	 */
	public final Map<Long, ProposalPlace> getProporsalPlaceMap() {
		return proporsalPlaceMap;
	}

	/**
	 * @param proporsalPlaceMap the proporsalPlaceMap to set
	 */
	public final void setProporsalPlaceMap(Map<Long, ProposalPlace> proporsalPlaceMap) {
		this.proporsalPlaceMap = proporsalPlaceMap;
	}
	
	

	 

}
