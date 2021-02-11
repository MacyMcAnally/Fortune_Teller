package com.revature.hackathon.service;

import java.util.List;

import com.revature.hackathon.model.Fortune;
import com.revature.hackathon.repo.FortuneRepo;

public class FortuneService {
	private FortuneRepo fortuneRepo;
	public List<Fortune> findAllFortune() {
		return fortuneRepo.findAll();
	}

}
