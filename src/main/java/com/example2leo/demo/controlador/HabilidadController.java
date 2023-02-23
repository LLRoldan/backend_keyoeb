
package com.example2leo.demo.controlador;

import com.example2leo.demo.modelo.Habilidad;
import com.example2leo.demo.service.HabilidadService;
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
@RequestMapping("/habil")
@CrossOrigin("*")//(origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
public class HabilidadController {
     @Autowired
    private HabilidadService iHabilServ;

     @GetMapping ("/lista")
    public ResponseEntity<List<Habilidad>> list(){
        List<Habilidad> list =  iHabilServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista de educaciones por id de persona
    @GetMapping ("/{id}/lista")
    public List <Habilidad> listaPer(@PathVariable Long id){
        return iHabilServ.findByPersonaId(id);    
        }
    
    
              
    @GetMapping("/detail/{id}")
    public ResponseEntity<Habilidad> detail(@PathVariable("id") Long id){
        Habilidad habil =iHabilServ.buscarHabil(id) ;
        return new ResponseEntity(habil, HttpStatus.OK);
    }
    
         
       @PostMapping("/create")
    public  void saveHabilidad(@RequestBody Habilidad habil){
        iHabilServ.saveHabilidad(habil);
     
    }
   
    @DeleteMapping("/delete/{id}")
    public String borrarHabilidad(@PathVariable Long id) {
       iHabilServ.borrarHabilidad(id);
        return "se borro la Habilidad";
    }

  
    
    }

