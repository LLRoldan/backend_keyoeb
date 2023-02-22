package com.example2leo.demo.controlador;
import com.example2leo.demo.modelo.Experiencia;
import com.example2leo.demo.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
  
@RestController
@RequestMapping("/expe")
@CrossOrigin("*")//(origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService iExperServ;

     @GetMapping ("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list =  iExperServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista de educaciones por id de persona
    @GetMapping ("/{id}/lista")
    public List <Experiencia> listaPer(@PathVariable Long id){
        return iExperServ.findByPersonaId(id);    
        }
    
    
              
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detail(@PathVariable("id") Long id){
        Experiencia expe = iExperServ.buscarExp(id) ;
        return new ResponseEntity(expe, HttpStatus.OK);
    }
    
   
     
    
       @PostMapping("/create")
    public  void saveExperiencia(@RequestBody Experiencia expe){
        iExperServ.saveExperiencia(expe);
        
    }
   
    @DeleteMapping("/delete/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        iExperServ.borrarExperiencia(id);
        return "se borro la Experiencia";
    }

  
    
    }

    
