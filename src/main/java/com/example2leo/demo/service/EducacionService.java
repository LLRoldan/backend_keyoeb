
package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Educacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example2leo.demo.repository.EducacionRepository;

@Service
@Transactional
public class EducacionService {
        
    @Autowired
    EducacionRepository rEstudio;
    
    public List<Educacion> list(){
        return rEstudio.findAll();
    }
    
    public Educacion getEdu(int id){
        Educacion expe = rEstudio.findById(id).orElse(null);
        return expe;
    }
    
    public void save(Educacion estu){
        rEstudio.save(estu);
    }
    
     public void deleteado(int id){
        rEstudio.deleteById(id);
    }
    
    public void edit(Educacion estu){
        rEstudio.save(estu);
    }
     
    
    
}
