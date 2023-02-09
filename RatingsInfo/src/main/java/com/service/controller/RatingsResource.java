package com.service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.model.Ratings;
import com.service.model.UserRating;


@RestController
@RequestMapping("/ratings")
public class RatingsResource {
	
	
	@GetMapping("/{movieId}")
	public Ratings getRating(@PathVariable("movieId") String movieId) {
		return new Ratings(movieId, 5);
		
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getlistRating(@PathVariable("userId") String userId) {
		List<Ratings> ratings=Arrays.asList(
				new Ratings("1234",3 ),
				new Ratings("1235",5 ),
				new Ratings("1236",2 )
				);
		
		UserRating userRating = new UserRating();
		userRating.setUsertaings(ratings);
		System.out.println("////////////" + userRating);
		return userRating;
		
	}


	 
}
