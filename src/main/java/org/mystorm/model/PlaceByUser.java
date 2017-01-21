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

	/**
	 * @return the travelEventId
	 */
	public final long getTravelEventId() {
		return travelEventId;
	}

	/**
	 * @param travelEventId
	 *            the travelEventId to set
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
	 * @param id
	 *            the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the proporsalPlaceList
	 */
	public final List<ProposalPlace> getProporsalPlaceList() {
		return proporsalPlaceList;
	}

	/**
	 * @param proporsalPlaceList
	 *            the proporsalPlaceList to set
	 */
	public final void setProporsalPlaceList(List<ProposalPlace> proporsalPlaceList) {
		this.proporsalPlaceList = proporsalPlaceList;
	}

}
