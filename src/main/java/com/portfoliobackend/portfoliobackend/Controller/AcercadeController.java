
package com.portfoliobackend.portfoliobackend.Controller;

import com.portfoliobackend.portfoliobackend.Model.AcercaDe;
import com.portfoliobackend.portfoliobackend.Service.AcercadeService;
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


@CrossOrigin("*")
@RestController
public class AcercadeController {
    
    @Autowired
    private AcercadeService interAcercade;
   
    
    //@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/acercade/traer")
    public List<AcercaDe> getAcerca(){
        
        return interAcercade.getData();
  
    }

    @GetMapping("/acercade/traer/{id}")
    public AcercaDe getSoftSkill(@PathVariable Long id){
        
        return interAcercade.getData(id);
  
    }
      
    @PostMapping("/acercade/crear")
    public String createAcerca(@RequestBody AcercaDe acerca){
    
        interAcercade.saveData(acerca);
        return "La info fue creada correctamente";
        
    }
    
    @DeleteMapping("/acercade/borrar/{id}")
    public String deleteAcerca(@PathVariable Long id){
        
        interAcercade.deleteData(id);
        return "La info fue eliminada correctamente";
        
    }
  
    @PutMapping("/acercade/actualizar")
    public boolean updateAcercade(@RequestBody AcercaDe acerca){
        interAcercade.updateData(acerca);
        
        return true;
     }
     
    
    
}
