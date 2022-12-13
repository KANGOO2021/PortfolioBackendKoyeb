
package com.portfoliobackend.portfoliobackend.Service;


import com.portfoliobackend.portfoliobackend.Model.Educacion;
import com.portfoliobackend.portfoliobackend.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements interfaceCrud<Educacion> {
    
    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getData() {
        List<Educacion> listaEducacion = educacionRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveData(Educacion educa) {
        educacionRepository.save(educa);
    }

    @Override
    public void deleteData(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion getData(Long id) {
        Educacion educa=educacionRepository.findById(id).orElse(null);
        return educa;
    }

    @Override
    public boolean updateData(Educacion educa) {
        educacionRepository.saveAndFlush(educa);
        
        return true;
    }
    
}
