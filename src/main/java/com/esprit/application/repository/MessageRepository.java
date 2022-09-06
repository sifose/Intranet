package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspMessage;

@Repository
public interface MessageRepository extends JpaRepository<EspMessage, Long> {
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.DEST_MSG = ?1", nativeQuery = true) // SQL
	  List<EspMessage> findByDestMsg(String destMsg);
	
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.SENDER_MSG = 'A' ", nativeQuery = true) // SQL
	  List<EspMessage> findByAdmin();
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.ID_ENS = ?1", nativeQuery = true) // SQL
	  List<EspMessage> findByEnseignant(String idEns);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.DEST_MSG = ?1 AND TYPE_MSG = 'Vers parents' ", nativeQuery = true) // SQL
	  List<EspMessage> findByParents(String destMsg);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE TYPE_MSG = 'vers Etudiant' AND e.DEST_MSG = ?1  ", nativeQuery = true) // SQL
	  List<EspMessage> findByEtudiant(String destMsg);
	
}
