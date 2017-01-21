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
	 
	List<Poi> listaPoi;
	List<User> listaUsers;
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
	 * @return the listaPoi
	 */
	public final List<Poi> getListaPoi() {
		return listaPoi;
	}
	/**
	 * @param listaPoi the listaPoi to set
	 */
	public final void setListaPoi(List<Poi> listaPoi) {
		this.listaPoi = listaPoi;
	}
	/**
	 * @return the listaUsers
	 */
	public final List<User> getListaUsers() {
		return listaUsers;
	}
	/**
	 * @param listaUsers the listaUsers to set
	 */
	public final void setListaUsers(List<User> listaUsers) {
		this.listaUsers = listaUsers;
	}
}


