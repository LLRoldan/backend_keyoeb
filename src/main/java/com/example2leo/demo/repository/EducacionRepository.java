package com.example2leo.demo.repository;

import com.example2leo.demo.modelo.Educacion;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long>{

   // public List<Educacion> findByPersonaId(Long personaid);
   
     
 
}
