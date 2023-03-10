package com.example2leo.demo.modelo;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity

public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idEducacion;
    @NotNull
    private String titulo;

    private String descripcion;

    private String urlimagLogo;

    private String urlcertificado;

    private String descLinkSitioOrg;

    private String urllinkSitio;
    
    
 
    @ManyToOne/*(fetch = FetchType.LAZY)*/
    //creacion de columna con llave foranea
    @JoinColumn(name = "for_personaid", insertable=false, updatable=false)
    //para que se borre si se borra la persona
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long for_personaid;  
    
   
    public Educacion() {
    }

    public Educacion( Long id,  String tituloOb,  String textDesc,  String imagLogo, 
             String certificado,  String descLinkSitio, String linkSitio , Persona persona ) {
       
        this.titulo = tituloOb;
        this.descripcion = textDesc;
        this.urlimagLogo = imagLogo;
        this.urlcertificado = certificado;
        this.descLinkSitioOrg = descLinkSitio;
        this.urllinkSitio = linkSitio;
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
