package com.EcoDelis.model;

import java.util.Date;

public class Responsable {
    private long id;
    private String nombre;
    private String apellido;
    private String cuit;
    private String email;
    private Date fnac;

    public Responsable(long id, String nombre, String apellido, String cuit, String email, Date fnac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.email = email;
        this.fnac = fnac;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }
}
