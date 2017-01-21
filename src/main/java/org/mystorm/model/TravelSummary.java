package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TravelSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	//lugar
	long cityId;	
	String cityName;
	
	long countryId;
	String countryName;
	
	long zoneId;
	String zoneName;
	

	//Duracion
	long startDate;
	long endDate;
	
	//
	int numMustBeToVisit;
	
	//
	// key: userId
	// value: PlaceByUser
	Map<Long, PlaceByUser> placeByUser;

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
	 * @return the cityId
	 */
	public final long getCityId() {
		return cityId;
	}

	/**
	 * @param cityId the cityId to set
	 */
	public final void setCityId(long cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the cityName
	 */
	public final String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public final void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the countryId
	 */
	public final long getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public final void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	/**
	 * @return the countryName
	 */
	public final String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public final void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the zoneId
	 */
	public final long getZoneId() {
		return zoneId;
	}

	/**
	 * @param zoneId the zoneId to set
	 */
	public final void setZoneId(long zoneId) {
		this.zoneId = zoneId;
	}

	/**
	 * @return the zoneName
	 */
	public final String getZoneName() {
		return zoneName;
	}

	/**
	 * @param zoneName the zoneName to set
	 */
	public final void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	/**
	 * @return the startDate
	 */
	public final long getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public final void setStartDate(long startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public final long getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public final void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the numMustBeToVisit
	 */
	public final int getNumMustBeToVisit() {
		return numMustBeToVisit;
	}

	/**
	 * @param numMustBeToVisit the numMustBeToVisit to set
	 */
	public final void setNumMustBeToVisit(int numMustBeToVisit) {
		this.numMustBeToVisit = numMustBeToVisit;
	}

	/**
	 * @return the placeByUser
	 */
	public final Map<Long, PlaceByUser> getPlaceByUser() {
		return placeByUser;
	}

	/**
	 * @param placeByUser the placeByUser to set
	 */
	public final void setPlaceByUser(Map<Long, PlaceByUser> placeByUser) {
		this.placeByUser = placeByUser;
	}
	
	

}
