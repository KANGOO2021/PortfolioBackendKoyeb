
package com.portfoliobackend.portfoliobackend.Service;

import com.portfoliobackend.portfoliobackend.Model.Proyectos;
import com.portfoliobackend.portfoliobackend.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements interfaceCrud<Proyectos>{
    
    @Autowired
    private ProyectosRepository proyectosRepository;

    @Override
    public List<Proyectos> getData() {
        List<Proyectos> listaProyectos = proyectosRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveData(Proyectos proyecto) {
        proyectosRepository.save(proyecto);
    }

    @Override
    public void deleteData(Long id) {
        proyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos getData(Long id) {
        Proyectos proyecto=proyectosRepository.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public boolean updateData(Proyectos proyecto) {
        proyectosRepository.saveAndFlush(proyecto);
        
        return true;
    }
    
}
