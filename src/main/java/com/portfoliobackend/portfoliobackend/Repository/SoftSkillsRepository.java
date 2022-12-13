
package com.portfoliobackend.portfoliobackend.Repository;


import com.portfoliobackend.portfoliobackend.Model.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillsRepository extends JpaRepository <SoftSkills, Long> {

    
    
}
