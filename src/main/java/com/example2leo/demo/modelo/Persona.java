
package com.example2leo.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona { 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    //@NotNull
    private String apellido;
    //@NotNull
    private String nombre;
           
    public Persona() {
    }

 

    public Persona(Long id, String nombre, String apellido) {
        this.id= id;
        this.apellido = apellido;
        this.nombre = nombre;
       
    }
    
}
