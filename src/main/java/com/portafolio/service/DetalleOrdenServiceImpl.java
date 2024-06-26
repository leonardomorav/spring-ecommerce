/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.service;

import com.portafolio.model.DetalleOrden;
import com.portafolio.repository.IDetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */

@Service    
public class DetalleOrdenServiceImpl implements IDetalleOrdenService {
    
    @Autowired
    private IDetalleOrdenRepository DetalleOrdenRepository;
    @Override
    public DetalleOrden save(DetalleOrden detalleOrden) {
        
        return DetalleOrdenRepository.save(detalleOrden);
       
    }
    
    
}
