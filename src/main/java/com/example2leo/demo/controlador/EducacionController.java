
package com.example2leo.demo.controlador;

import com.example2leo.demo.modelo.Educacion;
import com.example2leo.demo.service.IEducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class EducacionController {
    
    @Autowired
    private IEducacionService iEducacionService;

    //
    @PostMapping("/guardar/educacion")
    public  void agregar_actualizar_Educacion(@RequestBody Educacion e){
        iEducacionService.saveEducacion(e);
    }


    @GetMapping("/get/educaciones")
    @ResponseBody
    public Iterable<Educacion> getEducaciones() {
        return iEducacionService.getEducaciones();
    }

    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Integer id) {
        iEducacionService.deleteEducacion(id);
    }

}
