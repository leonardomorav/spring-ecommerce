
package com.portafolio.repository;

import com.portafolio.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends  JpaRepository<Producto, Integer>{
    
    
}
