package com.ms.service;

import java.util.List;

import com.ms.dao.Rating;

public interface RatingService {

	//create
	Rating createRating(Rating rating);
	
	//get all
	List<Rating> getRatings();
	
}
