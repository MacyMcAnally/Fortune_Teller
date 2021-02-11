package com.revature.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.hackathon.model.Fortune;
import com.revature.hackathon.repo.FortuneRepo;
@Service

public class FortuneService {
	@Autowired
	private FortuneRepo fortuneRepo;
	public List<Fortune> findAllFortune() {
		System.out.println("I am here !!!!!!"+ fortuneRepo.findAll());
		return fortuneRepo.findAll();
	}

}
