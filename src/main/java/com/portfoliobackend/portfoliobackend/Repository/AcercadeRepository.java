
package com.portfoliobackend.portfoliobackend.Repository;

import com.portfoliobackend.portfoliobackend.Model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercadeRepository extends JpaRepository <AcercaDe, Long>{
    
}



