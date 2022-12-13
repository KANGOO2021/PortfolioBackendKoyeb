package com.portfoliobackend.portfoliobackend.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfoliobackend.portfoliobackend.Security.Model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
    
}
