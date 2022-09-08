package com.esprit.application.controller;

import java.util.HashMap;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.EspCahierText;
import com.esprit.application.entity.EspEtudiant;
import com.esprit.application.entity.EspMessage;
import com.esprit.application.repository.CahierRepository;
import com.esprit.application.repository.EtudiantRepository;
import com.esprit.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CahierDeTexteController {
	
	@Autowired
	private CahierRepository cahierRepository;
	
	@GetMapping("/cahiers")
	public List<EspCahierText> getAllCahiers() {
		return cahierRepository.findAll();
	}
	
	@PostMapping("/cahiers")
	public EspCahierText createCahier(@Valid @RequestBody EspCahierText cahier) {
		return cahierRepository.save(cahier);
	} 
	/*
	@GetMapping("/cahier")
	public ResponseEntity<List<EspCahierText>> getCahierByIdEns(@RequestBody EspCahierTextPk espCahierTextPk)
			throws ResourceNotFoundException {
		List<EspCahierText> cahier = cahierRepository.findByEspCahierTextPk(espCahierTextPk);
				
		return ResponseEntity.ok().body(cahier);
	}*/
	
	
	@RequestMapping(value = "/cahierEnseignant/{idEns}", method = RequestMethod.GET)
    public List<EspCahierText> getCahiersbyenseignant(@PathVariable   String idEns) {
          return cahierRepository.findCahierByEnseignant(idEns);}

	
	
	
	
	/*
	@DeleteMapping("/cahier")
	public Map<String, Boolean> deleteCahier(@RequestBody EspCahierTextPk espCahierTextPk)
			throws ResourceNotFoundException {
		List<EspCahierText> cahier = cahierRepository.findByEspCahierTextPk(espCahierTextPk);
	    cahierRepository.deleteAll(cahier);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;  

        }  */
	
	
	
}