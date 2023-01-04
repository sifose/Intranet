package com.esprit.application.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspMessage;
import com.esprit.application.entity.EspMoyenne;


@Repository
public interface MoyenneRepository extends JpaRepository<EspMoyenne, Long> {

	EspMoyenne findByIdEt(String idEt);
	
	@Query(value = "SELECT * FROM ESP_MOYENNE e WHERE e.ID_ET = ?1 " , nativeQuery = true) // SQL
	  List<EspMoyenne> findByetudiant(String idEt);



}
