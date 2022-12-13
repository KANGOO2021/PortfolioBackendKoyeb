
package com.portfoliobackend.portfoliobackend.Repository;


import com.portfoliobackend.portfoliobackend.Model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository <Perfil, Long> {
    
}
