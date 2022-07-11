
package com.porfolio.jcz.Interface;

import com.porfolio.jcz.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo  Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por  ID
    public Persona findPersona(Long id);
    
}
