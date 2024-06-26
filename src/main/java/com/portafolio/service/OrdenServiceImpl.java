
package com.portafolio.service;

import com.portafolio.model.Orden;
import com.portafolio.repository.IOrdenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements IOrdenService{
   
    
    @Autowired
    private   IOrdenRepository ordenRepository;
    
    
    @Override
    public Orden save(Orden orden) {
        return  ordenRepository.save(orden);
    }
    
}
