
package com.portfoliobackend.portfoliobackend.Controller;

import com.portfoliobackend.portfoliobackend.Model.Educacion;
import com.portfoliobackend.portfoliobackend.Service.EducacionService;
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
public class EducacionController {
    
    @Autowired
    private EducacionService interEducacion;
    
    
    
    @GetMapping("/educacion/traer")
    public List<Educacion> getEducacion(){
        
        return interEducacion.getData();
  
    }
    
    @GetMapping("/educacion/traer/{id}")
    public Object getEducacion(@PathVariable Long id){
        
        return interEducacion.getData(id);
  
    }   
    
    @PostMapping("/educacion/crear")
    public void createEducacion(@RequestBody Educacion educa){
    
        interEducacion.saveData(educa);
        //return "La info fue creada correctamente";
        
    }
      
    @DeleteMapping("/educacion/borrar/{id}")
    public void deleteEducacion(@PathVariable Long id){
        
        interEducacion.deleteData(id);
       // return "La info fue eliminada correctamente";
        
    }
    
    @PutMapping("/educacion/actualizar")
     public boolean updateEducacion(@RequestBody Educacion educa){
        interEducacion.updateData(educa);
        
        return true;
     }
}
