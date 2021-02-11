package com.revature.hackathon.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.hackathon.model.Fortune;

public interface FortuneRepo extends JpaRepository<Fortune,Integer> {
	public List<Fortune> findAll();
}
