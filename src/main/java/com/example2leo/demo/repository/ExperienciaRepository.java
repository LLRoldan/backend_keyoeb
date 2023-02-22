package com.example2leo.demo.repository;

import com.example2leo.demo.modelo.Experiencia;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long>{

         //toma la lista de educaciones por persona
    List<Experiencia> findByPersonaId(Long for_personaid);
    
 
}
