package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Trabajo;
import com.example2leo.demo.repository.TrabajoReposirory;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TrabajoService implements ITrabajoService{
     @Autowired
     TrabajoReposirory rTrabajo;

    @Override
    public List<Trabajo> list() {
         return rTrabajo.findAll();
            }

    @Override
    public void saveTrabajo(Trabajo Trab) {
        rTrabajo.save(Trab);
       }

    @Override
    public void borrarTrabajo(Long id) {
        rTrabajo.deleteById(id);
     }

    @Override
    public void edit(Trabajo Trab) {
        rTrabajo.save(Trab);
     }

    @Override
    public Trabajo buscarTrab(Long id) {
         Trabajo Trab = rTrabajo.findById(id).orElse(null);
      return Trab;
       }
    
       public List<Trabajo> findByPersonaId(Long personaId) {
        return rTrabajo.findByPersonaId(personaId);
    }
  
}
