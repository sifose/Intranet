package com.esprit.application.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.EspEtudiant;
import com.esprit.exception.ResourceNotFoundException;
import com.esprit.application.repository.EtudiantRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EtudiantController {
	
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	

	@GetMapping("/etudiants")
	public List<EspEtudiant> getAllstudents() {
		return etudiantRepository.findAll();
	}
	
	@GetMapping("/etudiants/{idEt}")
	public ResponseEntity<EspEtudiant> getStudentById(@PathVariable(value = "idEt") String idEt)
			throws ResourceNotFoundException {
		EspEtudiant etudiant = etudiantRepository.findByIdEt(idEt);
				
		return ResponseEntity.ok().body(etudiant);
	}

	@PostMapping("/etudiants")
	public EspEtudiant createStudent(@Valid @RequestBody EspEtudiant etudiant) {
		return etudiantRepository.save(etudiant);
	} 
	
	@DeleteMapping("/etudiants/{idEt}")
	public Map<String, Boolean> deleteStudent(@PathVariable(value = "idEt") String idEt)
			throws ResourceNotFoundException {
		EspEtudiant student = etudiantRepository.findByIdEt(idEt);
	    etudiantRepository.delete(student);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@GetMapping("/etudiants/classe/{codeCl}")
	public List<EspEtudiant> getStudentByCodeCl(@PathVariable(value = "codeCl") String codeCl){
				
		List<EspEtudiant> etudiants =  etudiantRepository.findByCodeCl(codeCl);
		
		etudiants.forEach(etudiant -> System.out.println(etudiant));	
		return etudiants;
	}
	@GetMapping("/etudiantclasse/{idEt}")
	public String getStudentsclasse(@PathVariable(value = "idEt") String idEt)
			throws ResourceNotFoundException {
		EspEtudiant etudiant = etudiantRepository.findByIdEt(idEt);
				
		return etudiant.getClasseCouranteEt();
	}
	
	
}
