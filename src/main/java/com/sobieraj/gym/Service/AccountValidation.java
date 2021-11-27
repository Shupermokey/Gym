package com.sobieraj.gym.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sobieraj.gym.DAO.IAccount;

@Service
public class AccountValidation {
	
	@Autowired
	IAccount accountDAO;
	
	public boolean usernameExists(String username) {
		if(accountDAO.findAccountByuserName(username)==null) {
			return false;
		}
		return true;
		
		
		
	}
	
	public boolean passwordValidation(String pass) {
		
		if(pass.length()>=8) {
			return true;
		}
		return false;
	}
	
	public boolean passwordCorrect(String pass, String username) {
		System.out.println(pass + " " + username);
		if(pass != null && username !=null) {
		if(accountDAO.findAccountByuserName(username)==null) {
			return false;
		}
		else if(accountDAO.findAccountByuserName(username).getPass().equals(pass)) {
			return true;
		}
		
	}
		return false;
	}

}
