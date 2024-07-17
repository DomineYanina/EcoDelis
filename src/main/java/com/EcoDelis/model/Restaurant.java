package com.EcoDelis.model;

public class Restaurant {

    private long id;
    private String nombre;
    private String email;
    private String web;

    public Restaurant(long id, String nombre, String email, String web) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.web = web;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
