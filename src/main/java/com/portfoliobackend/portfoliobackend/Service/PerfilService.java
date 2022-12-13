
package com.portfoliobackend.portfoliobackend.Service;

import com.portfoliobackend.portfoliobackend.Model.Perfil;
import com.portfoliobackend.portfoliobackend.Repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements interfaceCrud<Perfil> {
    
    @Autowired
    private PerfilRepository perfilRepository;

    @Override
    public List<Perfil> getData() {
        List<Perfil> listaPerfil = perfilRepository.findAll();
        return listaPerfil;
    }

    @Override
    public void saveData(Perfil perfil) {
        perfilRepository.save(perfil);
    }

    @Override
    public void deleteData(Long id) {
        perfilRepository.deleteById(id);
    }

    @Override
    public Perfil getData(Long id) {
        Perfil perfil=perfilRepository.findById(id).orElse(null);
        return perfil;
    }

    @Override
    public boolean updateData(Perfil perfil) {
        perfilRepository.saveAndFlush(perfil);
        
        return true;
    }

  
    
}
