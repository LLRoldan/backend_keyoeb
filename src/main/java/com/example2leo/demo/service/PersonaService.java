package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Persona;
import com.example2leo.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

/*

@Service
public class PersonaService implements IPersonaService{
  
    
@Autowired (required = false)// agreue esto pero no se
public PersonaRepository persoRepo;

 
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    
    }
    @Override
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

    
}*/


@Service
@Transactional
public class PersonaService implements IPersonaService {
    @Autowired PersonaRepository rPersona;
   
    @Override
    public List<Persona> list(){
       return rPersona.findAll();
    }
    
    @Override
    public Persona buscarPersona(Long id){
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }    
   
    
    @Override
    public void crearPersona(Persona pers){
        rPersona.save(pers);
    }      
    
   
    @Override
     public void borrarPersona(Long id){
        rPersona.deleteById(id);
    }    
     
     public void edit(Persona pers){
        rPersona.save(pers);
    }  
       
   
}
