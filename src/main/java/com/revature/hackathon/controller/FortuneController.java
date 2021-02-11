package com.revature.hackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.hackathon.model.Fortune;
import com.revature.hackathon.service.FortuneService;

@RestController
@RequestMapping("/fortune")
public class FortuneController {
	@Autowired
	private FortuneService fortuneService;
	
	@GetMapping("/all")
	public List<Fortune> test() {
		return fortuneService.findAllFortune();
	}

}
