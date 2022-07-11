package com.porfolio.jcz.Repository;

import com.porfolio.jcz.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona, Long>{
    
    
}
