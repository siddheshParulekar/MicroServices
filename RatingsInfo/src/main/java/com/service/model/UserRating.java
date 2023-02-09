package com.service.model;

import java.util.List;

public class UserRating {

	private List<Ratings> usertaings;

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Ratings> usertaings) {
		super();
		this.usertaings = usertaings;
	}

	public List<Ratings> getUsertaings() {
		return usertaings;
	}

	public void setUsertaings(List<Ratings> usertaings) {
		this.usertaings = usertaings;
	}

	@Override
	public String toString() {
		return "UserRating [usertaings=" + usertaings + "]";
	}
	
	
}
