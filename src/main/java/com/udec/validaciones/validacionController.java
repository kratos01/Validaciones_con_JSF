/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.validaciones;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.persistence.Convert;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author David Arias
 */
@Named(value = "validacionController")
@RequestScoped
public class validacionController implements Serializable {

    /**
     * Creates a new instance of validacionController
     */
    /**
     * declaracion de variables con sus respectivas anotaciones de validacion 
     */
    @NotNull
    private String nombre;   
    @Min(0)
    @Max(10)
    private int numero;    
    @NotNull
    @Size(min=3,max=5)
    private String apellido;
    @Size(max=100)
    @Pattern(regexp=".+@.+\\.[a-z]+",message = "no coincide, ejemplo@algo.com")
    private String correo;
    //@Convert(attributeName = "$")
    @Pattern(regexp = "^[0-9]{1,3}([\\\\.][0-9]{3})*[\\\\,][0-9]{2}$",message = "no coincide, ejemplo 2.000,00")
    private String moneda;
    @Pattern(regexp = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$",message = "no coincide, ejemplo dd/mm/yyyy")
    private String fecha;
    /**
     * costructor de la clase 
     */
    public validacionController() {
    }
/**
 * getters y setters de la variables 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
