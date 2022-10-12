package com.esprit.application.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
