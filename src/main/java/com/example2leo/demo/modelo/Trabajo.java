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
public class Trabajo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idTrabajos;

    
    @NotNull
    private String tituloproyecto;

    private String descripcion;

    private String linkcaptura;

    private String linkaproyecto;

   
 
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    //creacion de columna con llave foranea
    @JoinColumn(name = "for_personaid", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long for_personaid;  

    public Trabajo() {
    }
    
   public Trabajo(Long id, String tituloproyecto, String descripcion, String linkcaptura, String linkaproyecto, Persona persona) {
      
       this.tituloproyecto = tituloproyecto;
        this.descripcion = descripcion;
        this.linkcaptura = linkcaptura;
        this.linkaproyecto = linkaproyecto;
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
