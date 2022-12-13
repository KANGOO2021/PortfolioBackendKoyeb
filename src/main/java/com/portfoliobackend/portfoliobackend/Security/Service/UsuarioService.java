package com.portfoliobackend.portfoliobackend.Security.Service;

import java.util.Set;

import com.portfoliobackend.portfoliobackend.Security.Model.Usuario;
import com.portfoliobackend.portfoliobackend.Security.Model.UsuarioRol;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
