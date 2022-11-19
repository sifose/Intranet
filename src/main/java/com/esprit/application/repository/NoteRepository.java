package com.esprit.application.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.ANote;

@Repository
public interface NoteRepository extends JpaRepository<ANote, Long> {
	
	@Query(value = "SELECT * FROM A_NOTE WHERE A_NOTE.CODE_CL = ?1 AND "
    		+ " A_NOTE.CODE_MODULE = ?2 AND A_NOTE.SEMESTRE = ?3 ", nativeQuery = true) // SQL
	  List<ANote> findNotes(String codeCl, String codeModule, BigDecimal semestre);
	
	@Query(value = "SELECT * FROM A_NOTE WHERE A_NOTE.AUTORISATION = 1", nativeQuery = true) // SQL
	  List<ANote> autorisations();
	
	@Query(value = "SELECT * FROM A_NOTE  WHERE A_NOTE.ID_ET = ?1", nativeQuery = true) // SQL
	  List<ANote> findbyEtudiant(String idEt);

	@Query(value = "SELECT * FROM A_NOTE  WHERE A_NOTE.CODE_CL = ?1", nativeQuery = true) // SQL
	  List<ANote> findbyClass(String codeCl);
	
	
	
	

}
