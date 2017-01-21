package org.mystorm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	List<User> userList;
	
	//
	TravelBoard travelBoard;

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
	 * @return the listaUsers
	 */
	public final List<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the listaUsers to set
	 */
	public final void setUserList(List<User> userList) {
		this.userList = userList;
	}

	/**
	 * @return the travelBoard
	 */
	public final TravelBoard getTravelBoard() {
		return travelBoard;
	}

	/**
	 * @param travelBoard the travelBoard to set
	 */
	public final void setTravelBoard(TravelBoard travelBoard) {
		this.travelBoard = travelBoard;
	}
	
	
}
