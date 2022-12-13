package com.portfoliobackend.portfoliobackend;

import com.portfoliobackend.portfoliobackend.Security.Model.Rol;
import com.portfoliobackend.portfoliobackend.Security.Model.Usuario;
import com.portfoliobackend.portfoliobackend.Security.Model.UsuarioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.portfoliobackend.portfoliobackend.Security.Service.UsuarioService;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PortfoliobackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(PortfoliobackendApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
        //se corre este código una vez para cargar el ADMIN
		/*
		 Usuario usuario = new Usuario();
		 
		 usuario.setNombre("Sergio");
		 usuario.setApellido("Muñoz");
		 usuario.setUsername("Sergiox");
		 usuario.setPassword(bCryptPasswordEncoder.encode("1234"));
		 usuario.setEmail("ser2004munoz@yahoo.com.ar");
		 usuario.setTelefono("1140679793");
                 usuario.setPerfil("foto.png");
		 
		 Rol rol = new Rol();
		 rol.setRolId(1L);
		 rol.setRolNombre("ADMIN");
		  
		 Set<UsuarioRol> usuariosRoles = new HashSet<>();
		 UsuarioRol usuarioRol = new UsuarioRol();
		 usuarioRol.setRol(rol);
		 usuarioRol.setUsuario(usuario);
		 usuariosRoles.add(usuarioRol);
		  
		 Usuario usuarioGuardado =
		 usuarioService.guardarUsuario(usuario,usuariosRoles);
		 System.out.println(usuarioGuardado.getUsername());
		 */

	}

}
