
package com.portfoliobackend.portfoliobackend.Service;

import java.util.List;

public interface interfaceCrud<T> {
    
        //metodo para traer todas las personas
    public List<T> getData();
    
    //metodo para dar de alta una persona
    public void saveData(T entity);
    
    //metodo para borrar una persona
    public void deleteData(Long id);
    
    //metodo para encontrar una persona
    public T getData(Long id);
    //public T findData(Long id)
    
    public boolean updateData(T entity);
    
}
