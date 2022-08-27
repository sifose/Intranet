package com.esprit.application.security;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.esprit.application.entity.Decid;
import com.esprit.application.entity.EspEnseignant;
import com.esprit.application.entity.EspEtudiant;
import com.esprit.application.repository.DecidRepository;
import com.esprit.application.repository.EnseignantRepository;
import com.esprit.application.repository.EtudiantRepository;

@Component
public class MyUserDetailsService implements UserDetailsService {

	private final EtudiantRepository etudiantRepository;
	private final DecidRepository decidRepository;
	private final EnseignantRepository enseignantRepository;

	private Set<String> Roles;

	public MyUserDetailsService(EtudiantRepository etudiantRepository, DecidRepository decidRepository,
			EnseignantRepository enseignantRepository) {

		this.etudiantRepository = etudiantRepository;
		this.decidRepository = decidRepository;
		this.enseignantRepository = enseignantRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	if (etudiantRepository.findByIdEt(username) != null)
		
		
		
	{ EspEtudiant etudiant = etudiantRepository.findByIdEt(username);
	
	Roles= new HashSet<>();
	Roles.add("etudiant");
	Roles.add("parent");
	List<GrantedAuthority> authorities = getUserAuthority(Roles);
	
		return new org.springframework.security.core.userdetails.User(etudiant.getIdEt(),etudiant.getPwdEt(),
			true,true,true,true,authorities); }
	
if (enseignantRepository.findByIdEns(username) != null)
		
		
		
	{ EspEnseignant enseignant = enseignantRepository.findByIdEns(username);
	
	Roles= new HashSet<>();
	Roles.add("enseignant");

	List<GrantedAuthority> authorities = getUserAuthority(Roles);
	
		return new org.springframework.security.core.userdetails.User(enseignant.getIdEns(),enseignant.getPwdEns(),
			true,true,true,true,authorities); }

if (decidRepository.findByIdDecid(username) != null)
	
	
	
{ Decid decid = decidRepository.findByIdDecid(username);

Roles= new HashSet<>();
Roles.add("admin");

List<GrantedAuthority> authorities = getUserAuthority(Roles);

	return new org.springframework.security.core.userdetails.User(decid.getIdDecid(),decid.getPwdDecid(),
		true,true,true,true,authorities); }
	
	
else return null;
	}
	
	
	
	private List<GrantedAuthority> getUserAuthority(Set<String> userRoles) {
		Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
		for (String role : userRoles) {
		roles.add(new SimpleGrantedAuthority(role)); }
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>(roles);
		return grantedAuthorities;
		}
	 
		
		
	
	

}
