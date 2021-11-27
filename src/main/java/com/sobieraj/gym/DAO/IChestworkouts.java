package com.sobieraj.gym.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sobieraj.gym.Entity.chestWorkouts;

@Repository
public interface IChestworkouts extends JpaRepository<chestWorkouts, Integer> {

}
