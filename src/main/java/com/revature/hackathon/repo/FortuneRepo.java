package com.revature.hackathon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.hackathon.model.Fortune;

public interface FortuneRepo extends JpaRepository<Fortune,Integer> {
	
}
