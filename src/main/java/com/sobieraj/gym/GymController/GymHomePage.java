package com.sobieraj.gym.GymController;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sobieraj.gym.DAO.IAccount;
import com.sobieraj.gym.Entity.Account;
import com.sobieraj.gym.Service.AccountValidation;

@Controller
public class GymHomePage {
	
	@Autowired
	IAccount accountDao;
	
	@Autowired
	AccountValidation accountService;
	
	
	@RequestMapping("/")
	public String LoginPage() {
		return "index";
		
	}
	
	@RequestMapping("/login")
	public String HomePage(Account account) {
		
		if(accountService.passwordCorrect(account.getPass(), account.getUserName())) {
			return "homePage";
		}
		else {
		return "errorPage";
		}
	}
	
	@RequestMapping("/createAccount")
	public String CreateAccountPage() {
		return "createAccountPage";
		
	}
	
	@RequestMapping("/createTheAccount")
	public ModelAndView CreateTheAccount(Account account) {
		String account_userName = account.getUserName();
		ModelAndView model = new ModelAndView();
		
		
		
 		if(accountService.usernameExists(account_userName)==false) {
			accountDao.save(account);
			model.setViewName("index");
			return model;
		}
		else {
			model.addObject("userNameTaken", account_userName);
			model.setViewName("errorPage");
		return model;
		}
		
	}

}
   