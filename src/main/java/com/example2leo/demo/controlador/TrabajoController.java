package com.example2leo.demo.controlador;

import com.example2leo.demo.modelo.Trabajo;
import com.example2leo.demo.service.TrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/trabajo")
//@CrossOrigin (origins = "http://localhost:4200")
@CrossOrigin("*")
//(origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
//@CrossOrigin( origins = {"https://porfolio-f5322.web.app/porfolio","http://localhost:4200"})
public class TrabajoController {
    @Autowired

    private TrabajoService iTrabajoServ;

    @GetMapping("/lista")
    public ResponseEntity<List<Trabajo>> list() {
        List<Trabajo> list = iTrabajoServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    //lista de educaciones por id de persona
    @GetMapping("/{id}/lista")
    public List<Trabajo> listaPer(@PathVariable Long id) {
        return iTrabajoServ.findByPersonaId(id);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Trabajo> buscarTrab(@PathVariable("id") Long id) {
        Trabajo trab = iTrabajoServ.buscarTrab(id);
        return new ResponseEntity(trab, HttpStatus.OK);
    }
    @PreAuthorize("permitAll")
    @PostMapping("/guardar")
    public void saveTrabajo(@RequestBody Trabajo trab) {
        iTrabajoServ.saveTrabajo(trab);

    }
    @PreAuthorize("permitAll")
    @DeleteMapping("/delete/{id}")
    public String borrarTrabajo(@PathVariable Long id) {
        iTrabajoServ.borrarTrabajo(id);
        return "se borro la Trabajo";
    }

}
