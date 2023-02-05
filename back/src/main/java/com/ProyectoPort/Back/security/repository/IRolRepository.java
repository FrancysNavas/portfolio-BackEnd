package com.ProyectoPort.Back.security.repository;

import com.ProyectoPort.Back.security.entity.Rol;
import com.ProyectoPort.Back.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
