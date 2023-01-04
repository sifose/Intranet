package com.esprit.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.ANote;
import com.esprit.application.entity.EspMoyenne;
import com.esprit.application.repository.MoyenneRepository;
import com.esprit.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MoyenneController {
	
	@Autowired 
	private MoyenneRepository moyenneRepository;
	
	@GetMapping("/moyennes")
	public List<EspMoyenne> getAllResults() {
		return moyenneRepository.findAll();
	}
	
	@PostMapping("/moyenne")
	public EspMoyenne createResult(@Valid @RequestBody EspMoyenne moyenne) {
		return moyenneRepository.save(moyenne);
	} 
	@PutMapping("/moyenne/{id}")
	public ResponseEntity<EspMoyenne> update(@PathVariable Long id,@RequestBody EspMoyenne cahier) throws ResourceNotFoundException {
		EspMoyenne updatecahier = moyenneRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("moyenne does not exist with id: " + id));
	     
		updatecahier.setObservation(cahier.getObservation());
		
		moyenneRepository.save(updatecahier);

        return ResponseEntity.ok(updatecahier);
    }
	
	@GetMapping("/moyenne/{idEt}")
	public List<EspMoyenne> findd (@PathVariable String idEt) throws ResourceNotFoundException {
		return (List<EspMoyenne>) moyenneRepository.findByetudiant(idEt);
				
    }
	

}
