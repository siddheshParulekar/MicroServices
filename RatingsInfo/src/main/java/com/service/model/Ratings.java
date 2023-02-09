package com.service.model;

public class Ratings {
	
	private String movieId;
	private int rating;
	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ratings(String movieId, int rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Ratings [movieId=" + movieId + ", rating=" + rating + "]";
	}
	

}
