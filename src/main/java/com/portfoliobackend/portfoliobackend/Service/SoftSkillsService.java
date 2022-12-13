package com.portfoliobackend.portfoliobackend.Service;
import com.portfoliobackend.portfoliobackend.Model.SoftSkills;
import com.portfoliobackend.portfoliobackend.Repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SoftSkillsService implements interfaceCrud<SoftSkills> {
    
    @Autowired
    private SoftSkillsRepository softskillRepository;


    @Override
    public List<SoftSkills> getData() {
        List<SoftSkills> listaSoftskills = softskillRepository.findAll();
        return listaSoftskills;
    }

  
    @Override
    public void saveData(SoftSkills sskills) {
        softskillRepository.save(sskills);
    }

    @Override
    public void deleteData(Long id) {
         softskillRepository.deleteById(id);
    }

    @Override
    public SoftSkills getData(Long id) {
        SoftSkills sskills=softskillRepository.findById(id).orElse(null);
        return sskills;
    }

    @Override
    public boolean updateData(SoftSkills sskills) {
        softskillRepository.saveAndFlush(sskills);
        
        return true;
    }
    
  
}
