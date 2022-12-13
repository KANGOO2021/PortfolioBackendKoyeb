
package com.portfoliobackend.portfoliobackend.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter @Setter
@Entity
public class Proyectos implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false, length=50, name="Titulo")
    private String titulo;
    
    @Column(nullable=false, length=200, name="Descripcion")
    private String descripcion;
    
    @Column(nullable=false, length=1000,name="Imagen")
    private String imagen;
    
    @Column(nullable=false, length=1000,name="GitHub")
    private String github;
    
    @Column(nullable=false, length=1000,name="Web")
    private String web;

    public Proyectos() {
    }

    public Proyectos(Long id, String titulo, String descripcion, String imagen,
            String github, String web) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.github = github;
        this.web = web;
    }
    
    
    
}
