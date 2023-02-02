package com.example2leo.demo.repository;

import com.example2leo.demo.modelo.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer>{
 
}
