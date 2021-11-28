package com.sobieraj.gym.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class chestWorkouts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chestId;
	
	private String name;
	private int max;
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	

}
