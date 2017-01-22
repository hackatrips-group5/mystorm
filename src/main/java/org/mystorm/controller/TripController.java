package org.mystorm.controller;

import java.util.List;

import org.mystorm.model.Trip;
import org.mystorm.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TripController {

    @Autowired
	private TripRepository repository;
	
    /**
     * TODO add user id to retrieve trips 
     * @param userName
     * @return
     */
    @RequestMapping("/trips")
    public List<Trip> trip(@RequestParam(value="name", defaultValue="World") String userName) {
        return repository.findAll();
    }
}


