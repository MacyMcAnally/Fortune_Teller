package com.revature.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.hackathon.model.Fortune;
import com.revature.hackathon.model.User;
import com.revature.hackathon.repo.FortuneRepo;
import com.revature.hackathon.repo.UserRepo;
@Service

public class FortuneService {
	@Autowired
	private FortuneRepo fortuneRepo;
	@Autowired
	private UserRepo userRepo;

	public List<Fortune> findAllFortune() {
		return fortuneRepo.findAll();
	}
	public Fortune generateFortuneRandomly(int id) {
		return fortuneRepo.findAllById(id);
	}
	public Fortune saveFortune(User user) {
		User user1 = new User(user.getId(), user.getUsername(),user.getPassword());
		Fortune fortune = new Fortune(1, null, "hello", user1);
		return fortuneRepo.save(fortune);
	}

}
