package com.portfoliobackend.portfoliobackend.Service;
import com.portfoliobackend.portfoliobackend.Model.AcercaDe;
import com.portfoliobackend.portfoliobackend.Repository.AcercadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AcercadeService implements interfaceCrud<AcercaDe> {
    
    @Autowired
    private AcercadeRepository acercaRepository;

    @Override
    public List<AcercaDe> getData() {
         List<AcercaDe> listaAcercade = acercaRepository.findAll();
        return listaAcercade;
    }

    @Override
    public void saveData(AcercaDe acerca) {
        acercaRepository.save(acerca);
    }

    @Override
    public void deleteData(Long id) {
        acercaRepository.deleteById(id);
    }

    @Override
    public AcercaDe getData(Long id) {
        //si no encuentro a la persona, devuelvo null por eso va el orElse
        AcercaDe acerca=acercaRepository.findById(id).orElse(null);
        return acerca;
    }

    
    @Override
    public boolean updateData(AcercaDe acerca) {
        acercaRepository.saveAndFlush(acerca);
        
        return true;
    }
    
}
