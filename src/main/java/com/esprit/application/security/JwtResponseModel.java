package com.esprit.application.security;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UserDetails; 
public class JwtResponseModel implements Serializable {
   /**
   *
   */
   private static final long serialVersionUID = 1L;
   private final UserDetails userdetails;
   private final String token;
   public JwtResponseModel(String token, UserDetails userdetails) {
      this.token = token;
      this.userdetails = userdetails;
   }
   public String getToken() {
      return token;
   }
public UserDetails getUserdetails() {
	return userdetails;
}
   
}
