package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> list(); ///list findAll /lista

    public void crearPersona(Persona per); //create save /save

    public void borrarPersona(Long id); //delete

    public Persona buscarPersona(Long id); 
}
