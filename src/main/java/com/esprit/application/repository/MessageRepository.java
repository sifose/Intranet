package com.esprit.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.esprit.application.entity.EspMessage;

@Repository
public interface MessageRepository extends JpaRepository<EspMessage, Long> {
	

}
