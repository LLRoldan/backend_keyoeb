package com.example2leo.demo.modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idEducacion;

    private String titulo;

    private String descripcion;

    private String urlimagLogo;

    private String urlcertificado;

    private String descLinkSitioOrg;

    private String urllinkSitio;

    public Educacion() {
    }

    public Educacion( Integer id,  String tituloOb,  String textDesc,  String imagLogo, 
             String certificado,  String descLinkSitio, String linkSitio ) {
        this.idEducacion = id;
        this.titulo = tituloOb;
        this.descripcion = textDesc;
        this.urlimagLogo = imagLogo;
        this.urlcertificado = certificado;
        this.descLinkSitioOrg = descLinkSitio;
        this.urllinkSitio = linkSitio;
    }

}
