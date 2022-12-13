
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
public class Perfil implements Serializable  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false, length=50, name="Nombre")
    private String nombre;
    
    @Column(nullable=false, length=100, name="Email")
    private String email;
    
    @Column(nullable=false, length=100, name="Puesto")
    private String Puesto;
    
    @Column(nullable=false, length=100,name="Ubicacion")
    private String ubicacion;
    
    @Column(nullable=false, length=1000,name="Imagen")
    private String imagen;
    
    @Column(nullable=false, length=1000,name="Bgimg1")
    private String bgimg1;
    
    @Column(nullable=false, length=1000,name="Bgimg2")
    private String bgimg2;
    
    @Column(nullable=false, length=1000,name="Bgimg3")
    private String bgimg3;

    public Perfil() {
    }

    public Perfil(Long id, String nombre, String email, String Puesto,
            String ubicacion, String imagen, String bgimg1, String bgimg2,
            String bgimg3) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.Puesto = Puesto;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.bgimg1 = bgimg1;
        this.bgimg2 = bgimg2;
        this.bgimg3 = bgimg3;
    }

  

 
    
    
  
}
