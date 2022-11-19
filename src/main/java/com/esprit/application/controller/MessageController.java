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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.ANote;
import com.esprit.application.entity.EspMessage;
import com.esprit.application.repository.MessageRepository;
import com.esprit.exception.ResourceNotFoundException;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MessageController {
	
	@Autowired
	private MessageRepository messageRepository;
	
	

	@GetMapping("/message")
	public List<EspMessage> getAllmessages() {
		return messageRepository.findAll();
	}
	

	@PostMapping("/message")
	public EspMessage createMessage(@Valid @RequestBody EspMessage message) {
		return messageRepository.save(message);
	} 
	
	@RequestMapping(value = "/messagedest/{destMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessages(@PathVariable   String destMsg) {
          return messageRepository.findByDestMsg(destMsg);}

	
	
	@RequestMapping(value = "/messageAdmin/{senderMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesbyAdmin(@PathVariable   String senderMsg) {
          return messageRepository.findByAdmin(senderMsg);}
	
	
	
	@RequestMapping(value = "/messageEnseignant/{senderMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesbyEnseignant(@PathVariable   String senderMsg) {
          return messageRepository.findByEnseignant(senderMsg);}
	
	@RequestMapping(value = "/messageParent/{destMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesbyParents(@PathVariable   String destMsg) {
          return messageRepository.findByParents(destMsg);}
	
	@RequestMapping(value = "/messageEtud/{destMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesbyEtudiant(@PathVariable   String destMsg) {
          return messageRepository.findByEtudiant(destMsg);}
	
	@RequestMapping(value = "/messageParentEnvoye/{senderMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesEnvoyebyParents(@PathVariable   String senderMsg) {
          return messageRepository.findBySenderParent(senderMsg);}
	
	@RequestMapping(value = "/messageEtudEnvoye/{senderMsg}", method = RequestMethod.GET)
    public List<EspMessage> findMessagesEnvoyebyEtudiant(@PathVariable   String senderMsg) {
          return messageRepository.findBySenderEtudiant(senderMsg);}

	@GetMapping("/messages/{id}")
	public ResponseEntity<EspMessage> get(@PathVariable Long id) throws ResourceNotFoundException {
		EspMessage updatecahier = messageRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("MESSAGE does not exist with id: " + id));
 

        return ResponseEntity.ok(updatecahier);
    }
	
	@PutMapping("/repondreMessage/{id}")
	public ResponseEntity<EspMessage> Reponde(@PathVariable Long id,@RequestBody EspMessage cahier) throws ResourceNotFoundException {
		EspMessage updatecahier = messageRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("cahier does not exist with id: " + id));
	     
		updatecahier.setReponse(cahier.getReponse());
		messageRepository.save(updatecahier);
        return ResponseEntity.ok(updatecahier);
    }
	
}
