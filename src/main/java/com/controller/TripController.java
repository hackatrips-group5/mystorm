package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trip;
import com.repository.TripRepository;


@RestController
public class TripController {

    @Autowired
	private TripRepository repository;
	
    @RequestMapping("/trips")
    public List<Trip> trip(@RequestParam(value="name", defaultValue="World") String userName) {
        return repository.findAll();
    }
}


