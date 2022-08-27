package com.esprit.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.esprit.application.repository.DecidRepository;
import com.esprit.application.repository.EnseignantRepository;
import com.esprit.application.repository.EtudiantRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private JwtAuthenticationEntryPoint authenticationEntryPoint;
	@Autowired
	private UserDetailsService myuserdetailsservice;
	@Autowired
	private JwtFilter filter;

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	
	auth.userDetailsService(myuserdetailsservice);
	}
	
	@Bean
	   @Override
	   public AuthenticationManager authenticationManagerBean() throws
	   Exception {
	      return super.authenticationManagerBean();
	   }
	
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

@Override
protected void configure(HttpSecurity http) throws Exception {
   http.csrf().disable()
   .authorizeRequests().antMatchers("/login").permitAll()
   .anyRequest().authenticated()
   .and()
   .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)
   .and()
   .cors()
   .and()
   .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
   http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
   
}

  
}
