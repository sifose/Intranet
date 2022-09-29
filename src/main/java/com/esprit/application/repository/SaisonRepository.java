package com.esprit.application.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.esprit.application.entity.EspSaisonUniversitaire;

@Repository
public interface SaisonRepository extends JpaRepository<EspSaisonUniversitaire, Long> {
	
    @Query(value = "SELECT MAX(ANNEE_DEB)FROM ESP_SAISON_UNIVERSITAIRE", nativeQuery = true) // SQL
	  String findSaison();


}
