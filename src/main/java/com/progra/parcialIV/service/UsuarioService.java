package com.progra.parcialIV.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.progra.parcialIV.model.*;
import com.progra.parcialIV.repository.*;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public void crearUsuarioCompleto(
            String nombreUsuario,
            String clave,
            String email,
            String fechaNacimiento,
            String rol
    ) {
        if (userRepository.existsByNombreUsuario(nombreUsuario)) {
            throw new RuntimeException("El nombre de usuario ya existe");
        }

        Usuario u = new Usuario();
        u.setNombreUsuario(nombreUsuario);
        u.setPasswordHash(passwordEncoder.encode(clave));
        u.setEmail(email);
    
        
        u = userRepository.save(u);

        
        datos.setTelefono(telefono);
        datos.setRol(rol);
        datos.setActivo(true);

        repoDatos.save(datos);
    }
}
