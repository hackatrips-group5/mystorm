package org.mystorm.service;

import org.mystorm.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Aggregate all Trips services and repositories
 * 
 * 
 * @author alberto
 *
 */

@Service
public class TripServices {

	@Autowired
	private TripRepository tripRepository;
	
	
	
}
