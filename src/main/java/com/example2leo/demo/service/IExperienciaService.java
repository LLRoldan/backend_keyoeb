package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Experiencia;
import java.util.List;



public interface IExperienciaService {
    
    public List<Experiencia> list();
              
    public void saveExperiencia(Experiencia expe);

    public void borrarExperiencia(Long id);
    
    public void edit(Experiencia expe);
    
    public Experiencia buscarExp(Long id);
      

   }
