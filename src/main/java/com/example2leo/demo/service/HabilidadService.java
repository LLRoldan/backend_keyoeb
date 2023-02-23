package com.example2leo.demo.service;
import com.example2leo.demo.modelo.Habilidad;
import com.example2leo.demo.repository.HabilidadRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadService implements IHabilidadService {
            
    @Autowired
    HabilidadRepository rHabilidad;
    
    @Override
    public List<Habilidad> list(){
        return rHabilidad.findAll();
    }
       
    @Override
    public Habilidad buscarHabil(Long id){
    Habilidad expe =rHabilidad.findById(id).orElse(null);
      return expe;
    }
            
    @Override
    public void edit(Habilidad habil){
       rHabilidad.save(habil);
    }

    @Override
    public void saveHabilidad(Habilidad habil) {
       rHabilidad.save(habil);
     }

    @Override
    public void borrarHabilidad(Long id) {
        rHabilidad.deleteById(id); }

      //busca lista deeducaciones por la id de la persona
    public List<Habilidad> findByPersonaId(Long personaId) {
        return rHabilidad.findByPersonaId(personaId);
    }

  

   

}

    
