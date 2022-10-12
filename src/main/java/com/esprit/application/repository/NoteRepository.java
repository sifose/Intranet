package com.esprit.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.application.entity.ANote;

@Repository
public interface NoteRepository extends JpaRepository<ANote, Long> {

}
