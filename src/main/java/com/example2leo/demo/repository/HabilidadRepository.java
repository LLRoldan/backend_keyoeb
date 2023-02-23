/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example2leo.demo.repository;
import com.example2leo.demo.modelo.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository  extends JpaRepository<Habilidad,Long>{
     List<Habilidad> findByPersonaId(Long for_personaid);
    
    
}
