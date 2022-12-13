
package com.portfoliobackend.portfoliobackend.Controller;


import com.portfoliobackend.portfoliobackend.Model.Proyectos;
import com.portfoliobackend.portfoliobackend.Service.ProyectosService;
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
public class ProyectosController {
    
    @Autowired
    private ProyectosService interProyectos;
    
    
    
    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyecto(){
        
        return interProyectos.getData();
  
    }
    
    @GetMapping("/proyectos/traer/{id}")
    public Object getProyecto(@PathVariable Long id){
        
        return interProyectos.getData(id);
  
    }   
    
    @PostMapping("/proyectos/crear")
    public void createProyecto(@RequestBody Proyectos proyecto){
    
        interProyectos.saveData(proyecto);
        //return "La info fue creada correctamente";
        
    }
      
    @DeleteMapping("/proyectos/borrar/{id}")
    public void deleteProyecto(@PathVariable Long id){
        
        interProyectos.deleteData(id);
       // return "La info fue eliminada correctamente";
        
    }
    
    @PutMapping("/proyectos/actualizar")
     public boolean updateProyecto(@RequestBody Proyectos proyecto){
        interProyectos.updateData(proyecto);
        
        return true;
     }
    
}
