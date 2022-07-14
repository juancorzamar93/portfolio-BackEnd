
package com.porfolio.jcz.Security.Repository;

import com.porfolio.jcz.Security.Entity.Rol;
import com.porfolio.jcz.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
