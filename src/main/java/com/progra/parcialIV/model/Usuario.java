package com.progra.parcialIV.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre", nullable = false)
    private String nombreUsuario;
    
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Timestamp fechaNacimiento;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "foto", nullable = true)
    private String foto;
}
