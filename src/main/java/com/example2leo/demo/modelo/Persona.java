
package com.example2leo.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
//@Table(name = "persona")
//public class Persona implements Serializable{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idPersona")
//    private Long id;

//    @Column(name = "nombre", nullable=false , length=45)
//    private String nombre;

//    @Column(name = "apellido", nullable=false, length=45)
//    private String apellido;
public class Persona { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;

 

    public Persona() {
    }

 

    public Persona(Long id, String nombre, String apellido) {
        this.id= id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
