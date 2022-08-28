
package com.portfolio.ap.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAbout {
    @NotBlank
    private String nombreA;
    @NotBlank
    private String descripcionA;

    public dtoAbout() {
    }

    public dtoAbout(String nombreA, String descripcionA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

   
}
