package com.example2leo.demo.modelo;
import com.example2leo.demo.modelo.Persona;
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

public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idExperiencia;
    @NotNull
    private String cargo;

    private String descripcion;

    private String periodo;

    private String imagenilustra;

    private String empresa;

    private String linkaempresa;
    
    
 
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    //creacion de columna con llave foranea
    @JoinColumn(name = "for_personaid", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long for_personaid;  
    
   
    public Experiencia() {
    }

    public Experiencia( Long id,  String tituloOb,  String textDesc,  String imagLogo, 
             String certificado,  String descLinkSitio, String linkSitio , Persona persona ) {
       
        this.cargo = tituloOb;
        this.descripcion = textDesc;
        this.periodo = imagLogo;
        this.imagenilustra = certificado;
        this.empresa = descLinkSitio;
        this.linkaempresa = linkSitio;
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
