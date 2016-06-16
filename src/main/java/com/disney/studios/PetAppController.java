package com.disney.studios;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class PetAppController {
	
	@Autowired
	PetLoader petLoader;
	
	@Autowired
	PicturesDao petDao;



	 @RequestMapping("/picsByBreed")
	    public List<DogPicture> getPicsByBreed (@RequestParam(value="breedName") String breedName) {
		 return petDao.getAllPicturesForBreed(breedName);

	    }
	 
	 @RequestMapping("/allPics")
	    public Iterable<DogPicture> getAlPics () {
		 return petDao.findAll();

	    }
	 
	 @RequestMapping(value="/voteUp", method=RequestMethod.PUT)
	 public void voteUp(@RequestParam(value="id")  Long id) {
		 petDao.voteUp(id);
	 }
	 
	 @RequestMapping(value="/voteDown", method=RequestMethod.PUT)
	 public void voteDown(@RequestParam(value="id")  Long id) {
		 petDao.voteDown(id);
	 }
	 
	 

}
