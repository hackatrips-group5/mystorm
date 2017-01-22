package org.mystorm.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class PlaceByUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	long travelEventId;

	// value: proposalPalce
	@OneToMany
	List<Proposal> proposalPlaceList;

}
