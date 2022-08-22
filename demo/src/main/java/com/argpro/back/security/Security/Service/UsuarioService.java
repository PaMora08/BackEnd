package com.argpro.back.security.Security.Service;


import com.argpro.back.security.Security.Entity.Usuario;
import com.argpro.back.security.Security.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public boolean existsByNombre(String nombre){
        return usuarioRepository.existsByNombre(nombre);
    }

    public Optional<Usuario> getByEmail(String email){
        return usuarioRepository.findByEmail(email);
    }
    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }


}

