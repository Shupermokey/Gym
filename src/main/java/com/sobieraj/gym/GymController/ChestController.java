package com.sobieraj.gym.GymController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sobieraj.gym.DAO.IChestworkouts;

@Controller
public class ChestController {
	
	@Autowired
	IChestworkouts IChest;
	
	@RequestMapping("/Chest")
	public ModelAndView chestWorkouts() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Chest");
		com.sobieraj.gym.Entity.chestWorkouts chest = new com.sobieraj.gym.Entity.chestWorkouts();
		chest.setMax(265);
		chest.setNinty((int) (265*.9));
		chest.setEighty((int) (265*.8));
		IChest.save(chest);
		mav.addObject("chestWorkouts", chest);
		
		return mav;
	}

}
