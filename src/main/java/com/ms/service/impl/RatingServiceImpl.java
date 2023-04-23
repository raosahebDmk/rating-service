package com.ms.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.dao.Rating;
import com.ms.repositories.RatingRepository;
import com.ms.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	public RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		String randomRatingId = UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		return ratingRepository.findAll();
	}
	
	public List<Rating> getRatingByUserId(String id)
	{
		return ratingRepository.findByUserId(id);
	}
	
	public List<Rating> getRatingByHotelId(String id)
	{
		return ratingRepository.findByHotelId(id);
	}
	
}
