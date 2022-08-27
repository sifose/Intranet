package com.esprit.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.EspEnseignant;
import com.esprit.application.entity.EspEtudiant;
import com.esprit.application.repository.EnseignantRepository;
import com.esprit.application.repository.EtudiantRepository;
import com.esprit.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EnseignantController {
	
	
	@Autowired
	private EnseignantRepository enseignatRepository;
	
	

	@GetMapping("/enseignants")
	public List<EspEnseignant> getAllprofs() {
		return enseignatRepository.findAll();
	}
	

	@PostMapping("/enseignants")
	public EspEnseignant createProf(@Valid @RequestBody EspEnseignant enseignant) {
		return enseignatRepository.save(enseignant);
	} 

}
