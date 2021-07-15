package com.example.ejemplo11;

import java.io.Serializable;

public class SocioRM implements Serializable {

    private String Nombre, Apellido1, Apellido2, Telefono, Email, Socio, Menor, Residencia;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {

        return Nombre;
    }

    public void setApellido1(String apellido) {
        Apellido1 = apellido;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public String getApellido2() {
        return Apellido2;
    }


    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setSocio(String socio) {
        Socio = socio;
    }

    public String getSocio() {
        return Socio;
    }

    public void setMenor(String menor) {
        Menor = menor;
    }

    public String getMenor() {
        return Menor;
    }

    public void setResidencia(String residencia) {
        Residencia = residencia;
    }

    public String getResidencia() {
        return Residencia;
    }
}
