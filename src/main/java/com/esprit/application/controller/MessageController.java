package com.esprit.application.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.EspMessage;
import com.esprit.application.repository.MessageRepository;


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

}
