package com.nfl.saints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NolaService {
	
	@Autowired
	private NolaOffenseRepository  nolaoffenseRepository;
	
	private  List<OffenseModel> omodel = new ArrayList<>(Arrays.asList(
			  new OffenseModel("QB","Drew Brees","Quarter Back"),
			  new OffenseModel("RB","Alvin Kamara","Running Back"),
			  new OffenseModel("RB","Mark Ingram","Running Back")
			  ));
	

	public List<OffenseModel> getAllTopics(){
		//return omodel; 
		/*
		 * Here Insteda of returning topics .. we are using mathods that are already implemented 
		 * in spring JPA Curd repository
		 * 
		 */
		
		List<OffenseModel> omodel = new ArrayList<>();
		nolaoffenseRepository.findAll()
		.forEach(omodel::add);		
		return omodel;
		
	}
	
	public OffenseModel getTopic(String id) {
		//return omodel.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		
		return nolaoffenseRepository.findById(id).orElse(null);
	}
	
	public void addPlayer(OffenseModel player) {
		//omodel.add(player);
		/*
		 * This also can be changed by implementing Spring JPA curd 
		 */
		nolaoffenseRepository.save(player);
	}

	public void updatePlayer(String id, OffenseModel player) {
		
     /*   for(int i = 0; i<omodel.size(); i++) {
        	OffenseModel om = omodel.get(i);
        	if(om.getId().equals(id)) {
        		omodel.set(i, player);
        		return;
        	}
        }*/
		
		/*
		 * This also can be changed by implementing Spring JPA curd 
		 */
		
		nolaoffenseRepository.save(player);
		
	}

	public void deletePlayer(String id) {
		//omodel.removeIf(t -> t.getId().equals(id));
		
		nolaoffenseRepository.deleteById(id);
	}


}
