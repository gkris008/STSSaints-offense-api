package com.nfl.saints;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NolaController {

	@Autowired
	private NolaService nolaService; 
	
	@RequestMapping("/topic")
	public List<OffenseModel> getAllTopics() {
		// returns list of objects Topic

		return Arrays.asList(new OffenseModel("QB", "Drew Brees", "Quarter Back"),
				new OffenseModel("RB", "Alvin Kamara", "Running Back"),
				new OffenseModel("RB", "Mark Ingram", "Running Back"));
	}	

	/*
	 * Moving this to service .. NolaService.java return Arrays.asList( new
	 * OffenseModel("QB","Drew Brees","Quarter Back"), new
	 * OffenseModel("RB","Alvin Kamara","Running Back"), new
	 * OffenseModel("RB","Mark Ingram","Running Back") );
	 */
	
	@RequestMapping("/saints")
	public List<OffenseModel> getAllPlayers() {
		return nolaService.getAllTopics();
	}
	
	@RequestMapping("/saints/{id}")
	public OffenseModel getPlayer(@PathVariable String id) {
		return nolaService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saints")
	public void addPlayer(@RequestBody OffenseModel player) {
		nolaService.addPlayer(player);		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/saints/{id}")
	public void updatePlayer(@RequestBody OffenseModel player, @PathVariable String id) {
		nolaService.updatePlayer(id,player);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/saints/{id}")
	public void deletePlayer( @PathVariable String id) {
		nolaService.deletePlayer(id);		
	}
	
}
