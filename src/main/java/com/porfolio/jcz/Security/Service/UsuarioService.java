
package com.porfolio.jcz.Security.Service;

import com.porfolio.jcz.Security.Entity.Usuario;
import com.porfolio.jcz.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.finByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario (String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    
    }
    
     public boolean existsByEmail   (String email){
        return iusuarioRepository.existsByEmail(email);
     }
     
     public void save (Usuario usuario){
         iusuarioRepository.save(usuario);
     
     }
     
}
     
