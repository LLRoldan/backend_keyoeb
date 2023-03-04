package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Trabajo;
import java.util.List;

public interface ITrabajoService {
    
      
    public List<Trabajo> list();
              
    public void saveTrabajo(Trabajo Trab);

    public void borrarTrabajo(Long id);
    
    public void edit(Trabajo Trab);
    
    public Trabajo buscarTrab(Long id);
      
    }
