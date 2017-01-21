package org.mystorm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String name;
	double latitude;
	double longitude;
	
	long country_id;
	long zone_id;
	long city_id;
	long subcategory_id;
	String picture_url;
	/**
	 * @return the id
	 */
	public final long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(long id) {
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
	 * @return the latitude
	 */
	public final double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public final void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public final double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public final void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the country_id
	 */
	public final long getCountry_id() {
		return country_id;
	}
	/**
	 * @param country_id the country_id to set
	 */
	public final void setCountry_id(long country_id) {
		this.country_id = country_id;
	}
	/**
	 * @return the zone_id
	 */
	public final long getZone_id() {
		return zone_id;
	}
	/**
	 * @param zone_id the zone_id to set
	 */
	public final void setZone_id(long zone_id) {
		this.zone_id = zone_id;
	}
	/**
	 * @return the city_id
	 */
	public final long getCity_id() {
		return city_id;
	}
	/**
	 * @param city_id the city_id to set
	 */
	public final void setCity_id(long city_id) {
		this.city_id = city_id;
	}
	/**
	 * @return the subcategory_id
	 */
	public final long getSubcategory_id() {
		return subcategory_id;
	}
	/**
	 * @param subcategory_id the subcategory_id to set
	 */
	public final void setSubcategory_id(long subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	/**
	 * @return the picture_url
	 */
	public final String getPicture_url() {
		return picture_url;
	}
	/**
	 * @param picture_url the picture_url to set
	 */
	public final void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}
}


