package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	String name;
	
	// 0 Anfitrion
	// 1 Invitado
	int rol;
	
	// key: travelSummaryId
	// value: travelSummary
	Map<Long, TravelSummary> travelSummaryMap;

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
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rol
	 */
	public final int getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public final void setRol(int rol) {
		this.rol = rol;
	}

	/**
	 * @return the travelSummaryMap
	 */
	public final Map<Long, TravelSummary> getTravelSummaryMap() {
		return travelSummaryMap;
	}

	/**
	 * @param travelSummaryMap the travelEventMap to set
	 */
	public final void setSummaryEventMap(Map<Long, TravelSummary> travelSummaryMap) {
		this.travelSummaryMap = travelSummaryMap;
	}
			

}
