package com.ProyectoPort.Back.security.service;

import com.ProyectoPort.Back.security.entity.Rol;
import com.ProyectoPort.Back.security.enums.RolNombre;
import com.ProyectoPort.Back.security.repository.IRolRepository;
import javax.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
  
    @Autowired
    IRolRepository iRolRepository;
    
    //llamamos al metodo del repository
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        iRolRepository.save(rol);
    }
    
     
    
    
}
