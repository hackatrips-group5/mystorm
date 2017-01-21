package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.model.storm.User;

@Entity
public class Trip {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	 
	List<Poi> listaPoi;
	List<User> listaUsers;
}


