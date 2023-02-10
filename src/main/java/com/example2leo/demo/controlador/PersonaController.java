
package com.example2leo.demo.controlador;

import com.example2leo.demo.modelo.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example2leo.demo.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
@RequestMapping("/persona")

@CrossOrigin (origins = "http://localhost:4200")
//@CrossOrigin("*")//(origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
public class PersonaController {
    
    @Autowired 
    private PersonaService IPersonaSer;
    
    
    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas() {
        return IPersonaSer.list();
    }
    
    
    //@GetMapping ("/lista")
    //@ResponseBody
    //public ResponseEntity<List<Persona>> list(){
     // List<Persona> list = IPersonaSer.list();
  // return new ResponseEntity(list, HttpStatus.OK);
        // }
     
    
    
    
  //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") Long id){
        Persona perso = IPersonaSer.buscarPersona(id);
        return new ResponseEntity(perso, HttpStatus.OK);
    }       
     
    
  //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public void save(@RequestBody Persona persona){
        IPersonaSer.crearPersona(persona);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        IPersonaSer.borrarPersona(id);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public void edit(@RequestBody Persona persona){
        IPersonaSer.edit(persona);
    }
            
}

/*
@Controller
@RequestMapping("persona")
@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class PersonaController {
    @Autowired//(required = false)
private PersonaService persoServ;
  
       
    @PostMapping("/new")
    public void agregarPersona(@RequestBody Persona per) {
        System.out.println("funciona hasta acá?");
              persoServ.crearPersona(per);
               //      return "la persona se creo perfeto";
    }
       
    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public String borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        return "se borro la persona";
    }
  
     @PutMapping("/editar/{id}")
         public Persona editPersona(@PathVariable Long id,
                                 @RequestParam ("nombre") String nuevoNombre,
                                 @RequestParam ("apellido") String nuevoApellido)
                                {
         Persona persona = persoServ.buscarPersona(id);
         persona.setNombre(nuevoNombre);
         persona.setApellido(nuevoApellido);


         persoServ.crearPersona(persona);
         return persona;
 }
}
*/


