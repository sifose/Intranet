package com.esprit.application.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.esprit.application.security.JwtRequestModel;
import com.esprit.application.security.JwtResponseModel;
import com.esprit.application.security.MyUserDetailsService;
import com.esprit.application.security.TokenManager;



@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class JwtController {

	
   @Autowired
   private MyUserDetailsService userDetailsService;
   @Autowired
   private AuthenticationManager authenticationManager;
   @Autowired
   private TokenManager tokenManager;
   

@PostMapping("/login")
   public Object createToken(@RequestBody JwtRequestModel
   request) throws Exception {
      try {
         authenticationManager.authenticate(
            new
            UsernamePasswordAuthenticationToken(request.getUsername(),
            request.getPassword())
         );
      } catch (DisabledException e) {
         throw new Exception("USER_DISABLED", e);
      } catch (BadCredentialsException e) {
         throw new Exception("INVALID_CREDENTIALS", e);
      }
      final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
      if (userDetails == null){
    	  throw new Exception("INVALID_CREDENTIALS");
      }
     
      final String jwtToken = tokenManager.generateJwtToken(userDetails);
      return ResponseEntity.ok(new JwtResponseModel(jwtToken, userDetails));
   }
   
 
   
}
