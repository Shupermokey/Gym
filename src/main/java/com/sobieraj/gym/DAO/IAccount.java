package com.sobieraj.gym.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sobieraj.gym.Entity.Account;

@Repository
public interface IAccount extends JpaRepository<Account, Integer>{
	
	public Account findAccountByuserName(String username);

}
