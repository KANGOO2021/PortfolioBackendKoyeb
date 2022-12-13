
package com.portfoliobackend.portfoliobackend.Controller;

import com.portfoliobackend.portfoliobackend.Model.HardSkills;
import com.portfoliobackend.portfoliobackend.Service.HardSkillsService;
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
public class HardSkillsController {
    
    @Autowired
    private HardSkillsService interHardSkills;
    
    
    
    @GetMapping("/hardskills/traer")
    public List<HardSkills> getHardSkill(){
        
        return interHardSkills.getData();
  
    }
    
    @GetMapping("/hardskills/traer/{id}")
    public Object getHardSkill(@PathVariable Long id){
        
        return interHardSkills.getData(id);
  
    }   
    
    @PostMapping("/hardskills/crear")
    public void createHardSkill(@RequestBody HardSkills sskills){
    
        interHardSkills.saveData(sskills);
        //return "La info fue creada correctamente";
        
    }
      
    @DeleteMapping("/hardskills/borrar/{id}")
    public void deleteHardSkill(@PathVariable Long id){
        
        interHardSkills.deleteData(id);
       // return "La info fue eliminada correctamente";
        
    }
    
    @PutMapping("/hardskills/actualizar")
     public boolean updateAcercade(@RequestBody HardSkills sskills){
        interHardSkills.updateData(sskills);
        
        return true;
     }
    
    
}
