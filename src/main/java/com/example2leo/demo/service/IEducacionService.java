package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Educacion;
import java.util.List;



public interface IEducacionService {
    
    public List<Educacion> list();
              
    public void saveEducacion(Educacion educa);

    public void borrarEducacion(Long id);
    
    public void edit(Educacion educa);
    
    public Educacion buscarEdu(Long id);
      

   }




    

   

    
