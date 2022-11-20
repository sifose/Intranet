package com.esprit.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.application.entity.Decid;
import com.esprit.application.repository.DecidRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class DecidController {
	
	
	@Autowired
	private DecidRepository decidRepository;
	
	@GetMapping("/decid/{idDecid}")
	public Decid getDecid(@PathVariable   String idDecid)
		{
		return  decidRepository.findByIdDecid(idDecid);
	    
        } 

}
