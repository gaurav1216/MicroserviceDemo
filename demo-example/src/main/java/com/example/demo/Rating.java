package com.example.demo;

public class Rating {

	int ratingId;
	String rating;
	public Rating() {
		// TODO Auto-generated constructor stub
	}
	public Rating(int ratingId,String rating) {
		this.ratingId=ratingId;
		this.rating=rating;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
