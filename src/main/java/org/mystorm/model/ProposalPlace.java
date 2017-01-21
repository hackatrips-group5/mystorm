package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProposalPlace {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	Poi poi;
	boolean mandatory;
	
	//
	int durationMinutes;
	
	// key: userId
	// value: valorarion
	Map<Long, Integer> otherMemberValorationMap;

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
	 * @return the poi
	 */
	public final Poi getPoi() {
		return poi;
	}

	/**
	 * @param poi the poi to set
	 */
	public final void setPoi(Poi poi) {
		this.poi = poi;
	}

	/**
	 * @return the mandatory
	 */
	public final boolean isMandatory() {
		return mandatory;
	}

	/**
	 * @param mandatory the mandatory to set
	 */
	public final void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	/**
	 * @return the durationMinutes
	 */
	public final int getDurationMinutes() {
		return durationMinutes;
	}

	/**
	 * @param durationMinutes the durationMinutes to set
	 */
	public final void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	/**
	 * @return the otherMemberValorationMap
	 */
	public final Map<Long, Integer> getOtherMemberValorationMap() {
		return otherMemberValorationMap;
	}

	/**
	 * @param otherMemberValorationMap the otherMemberValorationMap to set
	 */
	public final void setOtherMemberValorationMap(Map<Long, Integer> otherMemberValorationMap) {
		this.otherMemberValorationMap = otherMemberValorationMap;
	}			

}
