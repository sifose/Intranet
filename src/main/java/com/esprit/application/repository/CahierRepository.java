package com.esprit.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.EspCahierText;


@Repository
public interface CahierRepository extends JpaRepository<EspCahierText, Long> {
	//List <EspCahierText> findByEspCahierTextPk(EspCahierTextPk espCahierTextPk);
	List <EspCahierText> findByIdEns(String idEns); 

}
