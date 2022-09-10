package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspCahierText;
import com.esprit.application.entity.EspMessage;


@Repository
public interface CahierRepository extends JpaRepository<EspCahierText, Long> {
	//List <EspCahierText> findByEspCahierTextPk(EspCahierTextPk espCahierTextPk);
	List <EspCahierText> findByIdEns(String idEns); 
    

	@Query(value = "SELECT * FROM ESP_CAHIER_TEXT WHERE ESP_CAHIER_TEXT.ID_ENS = ?1", nativeQuery = true) // SQL
	  List<EspCahierText> findCahierByEnseignant(String idEns);
	
	@Query(value = "SELECT * FROM ESP_CAHIER_TEXT WHERE ESP_CAHIER_TEXT.CODE_CL = ?1", nativeQuery = true) // SQL
	  List<EspCahierText> findCahierbyClasse(String codeCl);
}
