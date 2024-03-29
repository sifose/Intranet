package com.esprit.application.controller;

import java.math.BigDecimal;
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

import com.esprit.application.entity.ANote;
import com.esprit.application.entity.EspCahierText;
import com.esprit.application.repository.NoteRepository;
import com.esprit.exception.ResourceNotFoundException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class NoteController {
	
	@Autowired
	private NoteRepository noterepository;
	
	@GetMapping("/notes")
	public List<ANote> getAllMarks() {
		return noterepository.findAll();
	}
	
	@PostMapping("/note")
	public ANote createMark(@Valid @RequestBody ANote note) {
		return noterepository.save(note);
	} 
	
	@DeleteMapping("/note/{id}")
	public Map<String, Boolean> delete(@PathVariable   Long id)
			throws ResourceNotFoundException {
		Optional<ANote> note = noterepository.findById(id);
		noterepository.deleteById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;  

        }
	@GetMapping("/notes/{codeCl}/{codeModule}/{semestre}")
	public List<ANote> get(@PathVariable String codeCl, @PathVariable String codeModule
			, @PathVariable BigDecimal semestre) {
		return  noterepository.findNotes(codeCl, codeModule, semestre);}
	
	@GetMapping("/autorisations")
	public List<ANote> getAutorisations() {
		return  noterepository.autorisations();}
				
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<ANote> get(@PathVariable Long id) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
 

        return ResponseEntity.ok(updatecahier);
    }
	@PutMapping("/notes/{id}")
	public ResponseEntity<ANote> update(@PathVariable Long id,@RequestBody ANote cahier) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
	     
		updatecahier.setOrale(cahier.getOrale());
		updatecahier.setTp(cahier.getTp());
		updatecahier.setDc1(cahier.getDc1());
		updatecahier.setDc2(cahier.getDc2());
		updatecahier.setDs(cahier.getDs());
		
		
		noterepository.save(updatecahier);

        return ResponseEntity.ok(updatecahier);
    }
	@PutMapping("/ValiderAutorisation/{id}")
	public ResponseEntity<ANote> autoriser(@PathVariable Long id,@RequestBody ANote cahier) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
	     
		updatecahier.setDateSaisie(cahier.getDateSaisie());
		updatecahier.setAutorisation(cahier.getAutorisation());
		noterepository.save(updatecahier);
        return ResponseEntity.ok(updatecahier);
    }
	
	@PutMapping("/annulerAutorisation/{id}")
	public ResponseEntity<ANote> Annulerautoriser(@PathVariable Long id,@RequestBody ANote cahier) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
		updatecahier.setJustification(cahier.getJustification());
		updatecahier.setAutorisation(cahier.getAutorisation());
		
		noterepository.save(updatecahier);
        return ResponseEntity.ok(updatecahier);
    }
	@PutMapping("/DemanderAutorisation/{id}")
	public ResponseEntity<ANote> Demandeautoriser(@PathVariable Long id,@RequestBody ANote cahier) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
	 
		updatecahier.setJustification(cahier.getJustification());
		updatecahier.setAutorisation(cahier.getAutorisation());
		
		noterepository.save(updatecahier);
        return ResponseEntity.ok(updatecahier);
    }
	
	@PutMapping("/ValiderNote/{id}")
	public ResponseEntity<ANote> validerNote(@PathVariable Long id,@RequestBody ANote cahier) throws ResourceNotFoundException {
		ANote updatecahier = noterepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));     
		updatecahier.setValidation(cahier.getValidation());
		updatecahier.setMoyenne(cahier.getMoyenne());
		noterepository.save(updatecahier);
        return ResponseEntity.ok(updatecahier);
    }
	
	@RequestMapping(value = "/noteEtudiant/{idEt}", method = RequestMethod.GET)
    public List<ANote> getCahiersbyetudiant(@PathVariable   String idEt) {
          return noterepository.findbyEtudiant(idEt);}
	
	@RequestMapping(value = "/notesClasse/{codeCl}", method = RequestMethod.GET)
    public List<ANote> getMarksbyclass(@PathVariable   String codeCl) {
          return noterepository.findbyClass(codeCl);}
	
	
	
	
}
