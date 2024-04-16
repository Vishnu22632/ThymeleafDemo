package com.springsecurity.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("name", "Vishnu Thakur");
		model.addAttribute("date", new Date().toLocaleString());
		
		return "about";
	}
	
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		System.out.println("Conditional handler executed...");
		m.addAttribute("isActive", true);
		
		m.addAttribute("gender", "M");
		
		List<Integer> list=List.of(12);
		
		m.addAttribute("myList", list);
		
		return "condition";
	}
	
	@GetMapping("/service")
	public String service(Model m) {
		
		m.addAttribute("title","I like to eat samosa");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		
		
		return "service";
	}

}













