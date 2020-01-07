package com.example.demo;

public class Movie {
	
	private String movieName;
	private int movieId;
	private Rating rating;
	

	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie( String movieName,int movieId,Rating rating) {
		this.movieName=movieName;
		this.movieId=movieId;
		this.rating=rating;
		
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}

}
