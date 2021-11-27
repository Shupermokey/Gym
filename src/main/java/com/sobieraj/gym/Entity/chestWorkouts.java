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
	
	private int max;
	private int ninty;
	private int eighty;


	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

	public int getNinty() {
		return ninty;
	}

	public void setNinty(int ninty) {
		this.ninty = ninty;
	}

	public int getEighty() {
		return eighty;
	}

	public void setEighty(int eighty) {
		this.eighty = eighty;
	}
	
	@Override
	public String toString() {
		return "chestWorkouts [max=" + max + "]";
	}
	
	

}
