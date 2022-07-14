
package com.porfolio.jcz.Security.Entity;

import com.porfolio.jcz.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private int id;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;
    
    
    //Constructor

    public Rol() {
    }
    
    //a la hora de insertar code - constructor - no poner el  id porque se autogenera, poner solamente el rol nombre

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
    
    
    
}
