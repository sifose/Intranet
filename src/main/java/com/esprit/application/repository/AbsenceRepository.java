package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.esprit.application.entity.EspAbsenceNew;
@Repository
public interface AbsenceRepository extends JpaRepository<EspAbsenceNew, Long> {

	
	
	@Query(value = "SELECT * FROM ESP_ABSENCE_NEW WHERE ESP_ABSENCE_NEW.ANNEE_DEB = extract(year from current_date)", nativeQuery = true) // SQL
	  List<EspAbsenceNew> findcurrentabsences();
	
}

