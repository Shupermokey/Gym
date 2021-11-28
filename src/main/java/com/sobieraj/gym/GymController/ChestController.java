package com.sobieraj.gym.GymController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.sobieraj.gym.DAO.IChestworkouts;

import com.sobieraj.gym.Entity.chestWorkouts;

@Controller
public class ChestController {
	
	@Autowired
	IChestworkouts IChest;
	

	
	@RequestMapping("/Chest")
	public ModelAndView chestWorkouts() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Chest");
		List<chestWorkouts> chestWorkoutList = IChest.findAll();
		mav.addObject("chestWorkouts", chestWorkoutList);
		return mav;
	}
	
	@RequestMapping("/addWorkout")
	public ModelAndView addChestWorkout(String name, int max) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Chest");
		
		chestWorkouts chest = new chestWorkouts();
		chest.setMax(max);
		chest.setName(name);
		IChest.save(chest);
		
		List<chestWorkouts> chestWorkoutList = IChest.findAll();
		
		mav.addObject("chestWorkouts", chestWorkoutList);
		
		return mav;
	}

}
