package com.esprit.application.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	
	@RequestMapping(value = "/cahierEnseignant/{idEns}", method = RequestMethod.GET)
    public List<EspCahierText> getCahiersbyenseignant(@PathVariable   String idEns) {
          return cahierRepository.findCahierByEnseignant(idEns);}
	
	@RequestMapping(value = "/cahierEtudiant/{codeCl}", method = RequestMethod.GET)
    public List<EspCahierText> getCahiersbyetudiant(@PathVariable   String codeCl) {
          return cahierRepository.findCahierbyClasse(codeCl);}
	
	@RequestMapping(value = "/cahier/{idEns}/{codeCl}/{dateSaisie}/{codeModule}", method = RequestMethod.GET)
	public List<EspCahierText> findCahiertext (@PathVariable   String idEns, String codeCl, String codeModule, LocalDateTime dateSaisie ) {
		 return cahierRepository.findCahier(idEns,codeCl,codeModule,dateSaisie);
	}
		
	@GetMapping("/cahier/{id}")
	public Optional<EspCahierText> getCahier(@PathVariable   String id)
		{
		return  cahierRepository.findById(id);
	    
        }  
	
	
	@DeleteMapping("/cahier/{id}")
	public Map<String, Boolean> deleteCahier(@PathVariable   String id)
			throws ResourceNotFoundException {
		Optional<EspCahierText> cahier = cahierRepository.findById(id);
	    cahierRepository.deleteById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;  

        }  
	
	 @PutMapping("/cahier/{id}")
	public ResponseEntity<EspCahierText> updateCahier(@PathVariable String id,@RequestBody EspCahierText cahier) throws ResourceNotFoundException {
		EspCahierText updatecahier = cahierRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
                
		updatecahier.setAnneeDeb(cahier.getAnneeDeb());
		updatecahier.setCodeCl(cahier.getCodeCl());
		updatecahier.setCodeModule(cahier.getCodeModule());
		updatecahier.setIdEns(cahier.getIdEns());
		updatecahier.setNumSeance(cahier.getNumSeance());
		updatecahier.setSujet(cahier.getSujet());
		updatecahier.setTitre(cahier.getTitre());
		updatecahier.setTrace(cahier.getTrace());
		updatecahier.setConfirm(cahier.getConfirm());
		
        cahierRepository.save(updatecahier);

        return ResponseEntity.ok(updatecahier);
    }
	 @PutMapping("/cahierconfirm/{id}")
		public ResponseEntity<EspCahierText> confirmCahier(@PathVariable String id) throws ResourceNotFoundException {
			EspCahierText updatecahier = cahierRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
	                
			
			updatecahier.setConfirm(true);
			
	        cahierRepository.save(updatecahier);

	        return ResponseEntity.ok(updatecahier);
	    }
	
}