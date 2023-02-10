package com.example2leo.demo.service;

import com.example2leo.demo.modelo.Educacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example2leo.demo.repository.EducacionRepository;


@Service
@Transactional
public class EducacionService implements IEducacionService{
        
    @Autowired
    EducacionRepository rEstudio;
    
    @Override
    public List<Educacion> list(){
        return rEstudio.findAll();
    }
       
    @Override
    public Educacion buscarEdu(Long id){
    Educacion estu = rEstudio.findById(id).orElse(null);
      return estu;
    }
            
    @Override
    public void edit(Educacion estu){
        rEstudio.save(estu);
    }

    @Override
    public void saveEducacion(Educacion educa) {
       rEstudio.save(educa);
     }

    @Override
    public void borrarEducacion(Long id) {
        rEstudio.deleteById(id); }

   /// @Override
   /// public List<Educacion> listaEducacion(Long id) {
    ///return rEstudio.findByPersonaId(id);
   /// }
   
}
