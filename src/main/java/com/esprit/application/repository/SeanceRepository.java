package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.CodeNomenclature;
import com.esprit.application.entity.Seance;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {
	

	
	

}
