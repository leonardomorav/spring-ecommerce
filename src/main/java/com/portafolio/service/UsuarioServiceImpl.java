
package com.portafolio.service;

import com.portafolio.model.Usuario;
import com.portafolio.repository.IUsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements  IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }
    
   

}
