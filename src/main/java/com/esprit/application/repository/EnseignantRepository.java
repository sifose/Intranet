package com.esprit.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspEnseignant;



@Repository
public interface EnseignantRepository extends JpaRepository<EspEnseignant, Long> {
	EspEnseignant findByIdEns(String idEns);
}
