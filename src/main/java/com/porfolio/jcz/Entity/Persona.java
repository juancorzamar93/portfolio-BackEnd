package com.porfolio.jcz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    @NotNull
    @Size(min = 1, max= 50, message= "no cumple con las longitudes")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max= 50, message= "no cumple con las longitudes")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max= 50, message= "no cumple con las longitudes")
    private String img;

    
    //hay dos maneras de generar getter y setter:
    //#Escribiendo el código mediante insert code 
    //#Importando getter y setter, pero para eso tenés que tener la dependencia lombok, que simplifica a la hora de estar escribiendo
    //códigos largos    
    
    
        
    
}
