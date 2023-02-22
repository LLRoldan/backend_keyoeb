package com.example2leo.demo.service;
import com.example2leo.demo.modelo.Experiencia;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example2leo.demo.repository.ExperienciaRepository;


@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
        
    @Autowired
    ExperienciaRepository rExperiencia;
    
    @Override
    public List<Experiencia> list(){
        return rExperiencia.findAll();
    }
       
    @Override
    public Experiencia buscarExp(Long id){
    Experiencia expe = rExperiencia.findById(id).orElse(null);
      return expe;
    }
            
    @Override
    public void edit(Experiencia estu){
        rExperiencia.save(estu);
    }

    @Override
    public void saveExperiencia(Experiencia expe) {
       rExperiencia.save(expe);
     }

    @Override
    public void borrarExperiencia(Long id) {
        rExperiencia.deleteById(id); }

      //busca lista deeducaciones por la id de la persona
    public List<Experiencia> findByPersonaId(Long personaId) {
        return rExperiencia.findByPersonaId(personaId);
    }

}
