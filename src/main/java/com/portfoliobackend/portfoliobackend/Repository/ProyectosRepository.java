
package com.portfoliobackend.portfoliobackend.Repository;

import com.portfoliobackend.portfoliobackend.Model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long> {
    
}
