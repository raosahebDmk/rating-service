package com.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.dao.Rating;
import com.ms.service.impl.RatingServiceImpl;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	public RatingServiceImpl ratingServiceImpl; 
	
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.createRating(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings()
	{
		return ResponseEntity.ok(ratingServiceImpl.getRatings());
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String id)
	{
		return ResponseEntity.ok(ratingServiceImpl.getRatingByUserId(id));
	}
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<List<Rating>> getRatingByHolteId(@PathVariable String id)
	{
		return ResponseEntity.ok(ratingServiceImpl.getRatingByHotelId(id));
	}

}
