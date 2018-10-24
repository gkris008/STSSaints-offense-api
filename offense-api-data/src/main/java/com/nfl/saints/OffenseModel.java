package com.nfl.saints;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To tell Database this model as a table is by annotation @entity
 * To tell id is the primary key use annotation @Id 
 * Once this is done ..entity is ready and next step is to use the service and connect to database and run the commands
 */
@Entity
public class OffenseModel {
	 @Id
	 private String id;
	 private String name;
	 private String description;
	 
	public OffenseModel() {
		
	}
	 
	public OffenseModel(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	 
	 
	
}

