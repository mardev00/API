package com.disney.studios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface DogRepositoy extends CrudRepository<DogPicture, Long> {

    List<DogPicture> findByBreed(String breedName);
    
    @Query("SELECT p FROM DogPicture p order by p.numVotesUp desc")
    List<DogPicture> findAll();
} 