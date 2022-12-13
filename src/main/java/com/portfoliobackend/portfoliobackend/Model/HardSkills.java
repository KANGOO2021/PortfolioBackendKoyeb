
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
public class HardSkills implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    
    @Column(nullable=false, length=100, name="Titulo")
    private String titulo;
    
    @Column(nullable=false, length=5, name="Porcentaje")
    private String porcentaje;
    
    @Column(nullable=false, length=20,name="Color")
    private String color;

    public HardSkills() {
    }

    public HardSkills(Long id, String titulo, String porcentaje, String color) {
        this.id = id;
        this.titulo = titulo;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
    
    
    
}
