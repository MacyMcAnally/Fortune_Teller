package com.revature.hackathon.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.hackathon.model.Fortune;
@Transactional
public interface FortuneRepo extends JpaRepository<Fortune,Integer> {
	public List<Fortune> findAll();
	public Fortune findAllById(int id);
}
