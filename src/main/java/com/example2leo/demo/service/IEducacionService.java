
package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Educacion;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface IEducacionService {
    
    public List<Educacion> getEducaciones();
    
    
    public void saveEducacion(Educacion per);

    public void deleteEducacion(Integer id);
    
}
