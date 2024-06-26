
package com.portafolio.repository;

import com.portafolio.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrdenRepository extends JpaRepository<Orden,Integer> {
    
    
    
}
