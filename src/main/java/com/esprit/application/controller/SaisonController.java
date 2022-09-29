package com.esprit.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esprit.application.repository.SaisonRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class SaisonController {
	@Autowired
	private SaisonRepository saisonRepository;
	
	@GetMapping("/saison")
	public String getSeason() {
		return saisonRepository.findSaison();
	}

}
