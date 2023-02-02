
package com.example2leo.demo.controlador;

import com.example2leo.demo.modelo.Educacion;
import com.example2leo.demo.modelo.Persona;
import com.example2leo.demo.service.EducacionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educ")
@CrossOrigin("*")//(origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
public class EducacionController {
    
    @Autowired
    private EducacionService iEducacionServ;

     @GetMapping ("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list =  iEducacionServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
              
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable("id") int id){
        Educacion estu = iEducacionServ.getEdu(id);
        return new ResponseEntity(estu, HttpStatus.OK);
    }
     
    
       @PostMapping("/guardar")
    public  void saveEducacion(@RequestBody Educacion educa){
        iEducacionServ.save(educa);
    }
   
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Integer id) {
        iEducacionServ.deleteado(id);
    }

         
    @PutMapping("/update")
    public void edit(@RequestBody Educacion estu) {      
        iEducacionServ.save(estu);
    }
     
    
    }
