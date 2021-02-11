package com.revature.hackathon.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.hackathon.model.Fortune;
import com.revature.hackathon.model.User;
import com.revature.hackathon.service.FortuneService;

@RestController
@RequestMapping("/fortune")
public class FortuneController {
	@Autowired
	private FortuneService fortuneService;
	
	@GetMapping("/all")
	public List<Fortune> findAllFortune() {
		return fortuneService.findAllFortune();
	}
	@GetMapping("/get")
	public Fortune  generateFortuneRandomly() {
		List<Fortune> myFortuneList = fortuneService.findAllFortune();
		int listSize = myFortuneList.size();
		int randomNumber = (int) (Math.random()*(listSize)) + 1;
		System.out.println("number is : "+randomNumber);
		return fortuneService.generateFortuneRandomly(randomNumber);
	}
	@PostMapping("/save")
	public Fortune saveFortune(@RequestBody User user) {
		return fortuneService.saveFortune(user);
	}

}
