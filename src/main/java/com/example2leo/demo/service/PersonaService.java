package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Persona;
import com.example2leo.demo.repository.PersonaRepository;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonaService implements IPersonaService{
  
    
//@Autowired (required = false)
public PersonaRepository persoRepo;

 
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
      @Transactional
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    
}
