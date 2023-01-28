
package com.example2leo.demo.modelo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona implements Serializable{ 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String apellido;
    @NotNull
    private String nombre;
           
    public Persona() {
    }
   public Persona(Long id, String apellido, String nombre) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
       
    }
 
}

 
