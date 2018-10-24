package com.nfl.saints;

import org.springframework.data.repository.CrudRepository;


public interface NolaOffenseRepository extends CrudRepository<OffenseModel, String>{
	
	/* We have to write  the below common crud methods . for this 
	 * Spring data jpa comes with common repository called CrudRepository 
	 * which contains logic for any entity class 
	 * So no need to implement these seperately 
	 *
	 */
	
	//getAllPlayers()
	//getPlayer(String id)
	//addPlayer(OffenseModel player)
	//updatePlayer(OffenseModel player)
	//deletePlayer(String id)

}
