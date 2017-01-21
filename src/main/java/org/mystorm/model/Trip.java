package org.mystorm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	List<User> userList;

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
	public final void setUserLista(List<User> userList) {
		this.userList = userList;
	}
}
