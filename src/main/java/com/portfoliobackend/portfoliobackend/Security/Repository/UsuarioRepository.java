package com.portfoliobackend.portfoliobackend.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfoliobackend.portfoliobackend.Security.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
    
}
