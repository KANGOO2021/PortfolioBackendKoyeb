
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
public class SoftSkills implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable=false, length=100)
    private String titulo;
    
    @Column(nullable=false, length=5)
    private String porcentaje;
    
  
    public SoftSkills() {
    }

    public SoftSkills(Long id, String titulo, String porcentaje) {
        this.id = id;
        this.titulo = titulo;
        this.porcentaje = porcentaje;
    }
    
    


 
}
