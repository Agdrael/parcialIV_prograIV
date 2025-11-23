package com.progra.parcialIV.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.progra.parcialIV.model.Usuario;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
}
