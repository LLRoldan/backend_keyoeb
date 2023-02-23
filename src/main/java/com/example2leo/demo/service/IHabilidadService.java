package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Habilidad;
import java.util.List;


public interface IHabilidadService {
        
    public List<Habilidad> list();
              
    public void saveHabilidad(Habilidad habil);

    public void borrarHabilidad(Long id);
    
    public void edit(Habilidad habil);
    
    public Habilidad buscarHabil(Long id);
     
    
}
