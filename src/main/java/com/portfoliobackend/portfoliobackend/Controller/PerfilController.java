
package com.portfoliobackend.portfoliobackend.Controller;

import com.portfoliobackend.portfoliobackend.Model.Perfil;
import com.portfoliobackend.portfoliobackend.Service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*") //@CrossOrigin(origins="http://localhost:4200")
@RestController
public class PerfilController {
    
     @Autowired
    private PerfilService interPerfil;
    
    
    
    @GetMapping("/perfil/traer")
    public List<Perfil> getPerfil(){
        
        return interPerfil.getData();
  
    }
    
    @GetMapping("/perfil/traer/{id}")
    public Object getPerfil(@PathVariable Long id){
        
        return interPerfil.getData(id);
  
    }   
    
    @PostMapping("/perfil/crear")
    public void createPerfil(@RequestBody Perfil perfil){
    
        interPerfil.saveData(perfil);
        //return "La info fue creada correctamente";
        
    }
      
    @DeleteMapping("/perfil/borrar/{id}")
    public void deletePerfil(@PathVariable Long id){
        
        interPerfil.deleteData(id);
       // return "La info fue eliminada correctamente";
        
    }
    
    @PutMapping("/perfil/actualizar")
     public boolean updatePerfil(@RequestBody Perfil perfil){
        interPerfil.updateData(perfil);
        
        return true;
     }
    
}
