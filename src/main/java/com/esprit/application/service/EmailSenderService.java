package com.esprit.application.service;


	public interface EmailSenderService {
	    void sendEmail(String from, String to, String subject, String message);
	}

