package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspMessage;

@Repository
public interface MessageRepository extends JpaRepository<EspMessage, Long> {
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.DEST_MSG = ?1" , nativeQuery = true) // SQL
	  List<EspMessage> findByDestMsg(String destMsg);
	
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.SENDER_MSG = ?1" , nativeQuery = true) // SQL
	  List<EspMessage> findByAdmin(String senderMsg);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.SENDER_MSG = ?1", nativeQuery = true) // SQL
	  List<EspMessage> findByEnseignant(String idEns);
	
	
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.DEST_MSG = ?1 AND TYPE_MSG = 'Vers parents' ", nativeQuery = true) // SQL
	  List<EspMessage> findByParents(String destMsg);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE TYPE_MSG = 'Vers élèves' AND e.DEST_MSG = ?1  ", nativeQuery = true) // SQL
	  List<EspMessage> findByEtudiant(String destMsg);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.SENDER_MSG = ?1 AND TYPE_MSG = 'Vers élèves'", nativeQuery = true) // SQL
	  List<EspMessage> findBySenderEtudiant(String senderMsg);
	
	@Query(value = "SELECT * FROM ESP_MESSAGE e WHERE e.SENDER_MSG = ?1 AND TYPE_MSG = 'Vers parents' ", nativeQuery = true) // SQL
	  List<EspMessage> findBySenderParent(String senderMsg);
	
}
