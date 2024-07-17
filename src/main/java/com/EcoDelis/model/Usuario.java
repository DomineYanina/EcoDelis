package com.EcoDelis.model;

import java.util.Date;

public class Usuario {

    private long id;
    private String tipo_dni;
    private long nro_dni;
    private String nombres;
    private String apellido;
    private String email;
    private String usuario;
    private String clave;
    private Date fnac;

    public Usuario(long id, String tipo_dni, long nro_dni, String nombres, String apellido, String email, String usuario, String clave, Date fnac) {
        this.id = id;
        this.tipo_dni = tipo_dni;
        this.nro_dni = nro_dni;
        this.nombres = nombres;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.fnac = fnac;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_dni() {
        return tipo_dni;
    }

    public void setTipo_dni(String tipo_dni) {
        this.tipo_dni = tipo_dni;
    }

    public long getNro_dni() {
        return nro_dni;
    }

    public void setNro_dni(long nro_dni) {
        this.nro_dni = nro_dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }
}
