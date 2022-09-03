package com.esprit.application.repository;


import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspEtudiant;


  
@Repository
public interface EtudiantRepository extends JpaRepository<EspEtudiant, Long> {
	EspEtudiant findByIdEt(String idEt);
	EspEtudiant findByPwdEt(String pwdEt);
	EspEtudiant findByPwdParent(String pwdParent);
	@Query(value = "SELECT * FROM ESP_ETUDIANT e WHERE e.CLASSE_COURANTE_ET = ?1", nativeQuery = true) // SQL
	  List<EspEtudiant> findByCodeCl(String classeCouranteEt);
	
	
}

 