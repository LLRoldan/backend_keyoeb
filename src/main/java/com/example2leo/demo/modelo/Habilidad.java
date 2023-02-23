
package com.example2leo.demo.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity


public class Habilidad implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idHabilidad;
    @NotNull
    private String nombreHabilidad;

    private int nivel;

     @ManyToOne/*(fetch = FetchType.LAZY)*/
    //creacion de columna con llave foranea
    @JoinColumn(name = "for_personaid", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long for_personaid;  
    
   
    public Habilidad() {
    }

    public Habilidad( Long id,  String nombreHabilidad, int nivel, Persona persona ) {
       
        this.nombreHabilidad = nombreHabilidad;
        this.nivel = nivel;
       this.persona = persona;
              
    }
       
        @JsonBackReference
    public Persona getPersona() {
        return persona;
    }
    
     public Long getPersonaid() {
        return for_personaid;
    }

}
