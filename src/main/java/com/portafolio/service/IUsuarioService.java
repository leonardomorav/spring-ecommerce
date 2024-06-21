
package com.portafolio.service;

import com.portafolio.model.Usuario;
import java.util.Optional;


public interface IUsuarioService {
    
    Optional<Usuario> findById(Integer id);
    
}
