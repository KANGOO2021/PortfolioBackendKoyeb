
package com.portfoliobackend.portfoliobackend.Service;

import com.portfoliobackend.portfoliobackend.Model.HardSkills;
import com.portfoliobackend.portfoliobackend.Repository.HardSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillsService implements interfaceCrud<HardSkills>{
    
    @Autowired
    private HardSkillsRepository hardskillRepository;
    

    @Override
    public List<HardSkills> getData() {
        List<HardSkills> listaHardSkills = hardskillRepository.findAll();
        return listaHardSkills;
    }

    @Override
    public void saveData(HardSkills sskills) {
        hardskillRepository.save(sskills);
    }

    @Override
    public void deleteData(Long id) {
        hardskillRepository.deleteById(id);
    }

    @Override
    public HardSkills getData(Long id) {
         HardSkills sskills=hardskillRepository.findById(id).orElse(null);
        return sskills;
    }

    @Override
    public boolean updateData(HardSkills sskills) {
        hardskillRepository.saveAndFlush(sskills);
        
        return true;
    }
    
}



  
  

  

  
