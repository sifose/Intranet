package com.esprit.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.EspAbsenceNew;
import com.esprit.application.entity.EspCahierText;
import com.esprit.application.repository.AbsenceRepository;
import com.esprit.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AbsenceController {
	
	@Autowired
	private AbsenceRepository absenceRepository;

	
	@PostMapping("/absences")
	public EspAbsenceNew createAbsence(@Valid @RequestBody EspAbsenceNew etudiant ) {
		return  absenceRepository.save(etudiant);
	} 
	
	@GetMapping("/absences")
	public List<EspAbsenceNew> getAllAbsences() {
		System.out.println("im here  ***********" + absenceRepository.findAll());
		return absenceRepository.findAll();
	}
	
	

}
