package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();

    public void crearPersona(Persona per);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);
}
