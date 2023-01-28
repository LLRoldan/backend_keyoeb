
package com.example2leo.demo.repository;

import com.example2leo.demo.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PersonaRepository extends  JpaRepository <Persona, Long>{
    
}

