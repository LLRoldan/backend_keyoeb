package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> getEducaciones();
        
    public void saveEducacion(Educacion per);

    public void deleteEducacion(Integer id);
    
    public Educacion buscarEducacion(Long id);
    
}
