package com.example2leo.demo.repository;

import com.example2leo.demo.modelo.Trabajo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajoReposirory extends JpaRepository<Trabajo,Long>{
        List<Trabajo> findByPersonaId(Long for_personaid);
}

