package com.disney.studios;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PicturesDao {
	

@Autowired
DataSource dataSource;

@Autowired
DogRepositoy repository;

public List<DogPicture> getAllPicturesForBreed(String breedName) {
	return repository.findByBreed(breedName);
}


public Iterable<DogPicture> findAll() {
	return repository.findAll();
}

public DogPicture findOne(long id) {
	return repository.findOne(id);
}

public void voteUp(long id) {
	DogPicture pic = findOne(id);
	pic.setNumVotesUp(pic.getNumVotesUp() + 1);
	repository.save(pic);

}

public void voteDown(long id) {
	DogPicture pic = findOne(id);
	pic.setNumVotesDown(pic.getNumVotesDown() + 1);
	repository.save(pic);
}

public int numVotesUp(long id) {
	DogPicture pic = findOne(id);
	return pic.getNumVotesUp();
}

public int numVotesDown(long id) {
	DogPicture pic = findOne(id);
	return pic.getNumVotesDown();
}

}
