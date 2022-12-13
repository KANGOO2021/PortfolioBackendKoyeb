
package com.portfoliobackend.portfoliobackend.Repository;


import com.portfoliobackend.portfoliobackend.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
