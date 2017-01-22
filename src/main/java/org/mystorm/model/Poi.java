package org.mystorm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * POI
 * 
 *
 */
@Entity
@Data
public class Poi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	Long miNubeId;
	
	String name;
	double latitude;
	double longitude;
	
	long country_id;
	long zone_id;
	long city_id;
	long subcategory_id;
	String picture_url;
}


