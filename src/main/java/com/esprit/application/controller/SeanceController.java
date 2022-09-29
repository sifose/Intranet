package com.esprit.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.CodeNomenclature;
import com.esprit.application.entity.Seance;
import com.esprit.application.repository.SeanceRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class SeanceController {
	
	@Autowired
	private SeanceRepository seanceRepository;
	
	@GetMapping("/seance")
	public List<Seance> getSeance() {
		return seanceRepository.findAll();
	}


}
