package com.disney.studios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DogPicture {
	
	private int numVotesUp;
	
	private int numVotesDown;
	
	private String dogName;
	
	private String additionalInformation;
	
	private int dogAge;
	
	public DogPicture() {
		
	}
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;
	
	private String url;
	
	private String breed;
	
	public DogPicture(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getNumVotesUp() {
		return numVotesUp;
	}

	public void setNumVotesUp(int numVotesUp) {
		this.numVotesUp = numVotesUp;
	}

	public int getNumVotesDown() {
		return numVotesDown;
	}

	public void setNumVotesDown(int numVotesDown) {
		this.numVotesDown = numVotesDown;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public int getDogAge() {
		return dogAge;
	}

	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
}
