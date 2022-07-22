
package com.porfolio.jcz.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank //esto es para que los campos no queden vacíos
    private String nombreE;
    @NotBlank
    private String descripcionE;
    
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
    //Getter and Setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
