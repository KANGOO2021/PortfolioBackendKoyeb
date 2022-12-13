
package com.portfoliobackend.portfoliobackend.Controller;

import com.portfoliobackend.portfoliobackend.Model.SoftSkills;
import com.portfoliobackend.portfoliobackend.Service.SoftSkillsService;
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
public class SoftSkillsController {
    
    
    @Autowired
    private SoftSkillsService interSoftSkills;
    
    
    //@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/softskills/traer")
    public List<SoftSkills> getSoftSkill(){
        
        return interSoftSkills.getData();
    }
    
    @GetMapping("/softskills/traer/{id}")
    public Object getSoftSkill(@PathVariable Long id){
        
        return interSoftSkills.getData(id);
  
    }   
    
    //@CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/softskills/crear")
    public void createSoftSkill(@RequestBody SoftSkills sskills){
    
        interSoftSkills.saveData(sskills);
        //return "La info fue creada correctamente";
        
    }
    
    //@CrossOrigin(origins="http://localhost:4200")
    @DeleteMapping("/softskills/borrar/{id}")
    public void deleteSoftSkill(@PathVariable Long id){
        
        interSoftSkills.deleteData(id);
       // return "La info fue eliminada correctamente";
        
    }
    
    @PutMapping("/softskills/actualizar")
     public boolean updateAcercade(@RequestBody SoftSkills sskills){
        interSoftSkills.updateData(sskills);
        
        return true;
     }
   
    
}
