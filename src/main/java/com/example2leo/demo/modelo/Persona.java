package com.example2leo.demo.modelo;
import java.io.Serializable;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter


public class Persona  implements Serializable  { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private String titulo;
    @NotNull
    private String domicilio;
    @NotNull
    private String ubicacion;
    
    private String telefono;
    
    private String email;
          
    @Size(min = 1, max = 1000, message = "1000 characters")
    private String urlfacebook;
    @Size(min = 1, max = 1000, message = "1000 characters")          
    private String urlinstagram;
    @Size(min = 1, max = 1000, message = "1000 characters")             
    private String urllinkedin;
    @Size(min = 1, max = 1000, message = "1000 characters")
    private String urlbaner;
    @Size(min = 1, max = 1000, message = "1000 characters")
    private String urlabatar;

    private String expertoEnprimero;
 
    private String expertoEnsegundo;
   
    private String expertoEntercero;
  
    //relacion y para que borre si la persona no existe
    //ver esto , el postman con persona con educacion falla
    @OneToMany( fetch = FetchType.EAGER,
            mappedBy="persona")
    
    private List<Educacion> educacion; 
           
    public Persona() {
    }
   
    public Persona(Long id,String nombre, String apellido, 
            String titulo, String domicilio, String ubicacion, String telefono,String email, 
            String urlfacebook, String urlinstagram,
            String urllinkedin,   String urlbaner, String urlabatar, String expertoEnprimero,
            String expertoEnsegundo, String expertoEntercero
    
    )

 {
     this.id = id;
     this.nombre = nombre;
     this.apellido = apellido;
     this.titulo = titulo;
     this.domicilio = domicilio;
     this.ubicacion = ubicacion;
     this.telefono = telefono;
     this.email = email;
        
     this.urlfacebook = urlfacebook;
     this.urlinstagram = urlinstagram;
     this.urllinkedin = urllinkedin;
     this.urlbaner = urlbaner;
     this.urlabatar = urlabatar;
     this.expertoEnprimero = expertoEnprimero;
     this.expertoEnsegundo = expertoEnsegundo;
     this.expertoEntercero = expertoEntercero;

  
    }
    
    
    // @JsonManagedReference
   // public List<Educacion> getEducacion() {
    //    return educacion;
    //}
 
}

 
