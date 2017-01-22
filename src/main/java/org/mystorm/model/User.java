package org.mystorm.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	// 0 Anfitrion
	// 1 Invitado
	public enum Rol {
	    GUEST,
	    HOST
	}
	
	@Enumerated(EnumType.STRING)
	Rol rol;
	
	// key: travelSummaryId
	// value: travelSummary
	@OneToMany
	Map<Long, Summary> travelSummary;

}
