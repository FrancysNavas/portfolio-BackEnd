package com.ProyectoPort.Back.security.repository;

import com.ProyectoPort.Back.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Optional<Usuario> findByNombreUsuario (String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
