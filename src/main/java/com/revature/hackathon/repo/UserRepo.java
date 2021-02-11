package com.revature.hackathon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.hackathon.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	public User findById(int id);
}
