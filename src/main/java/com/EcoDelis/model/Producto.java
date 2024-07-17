package com.EcoDelis.model;

public class Producto {
    private long id;
    private String nombre;
    private Double montoOriginal;
    private Double montoACobrar;

    public Producto(long id, String nombre, Double montoOriginal, Double montoACobrar) {
        this.id = id;
        this.nombre = nombre;
        this.montoOriginal = montoOriginal;
        this.montoACobrar = montoACobrar;
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

    public Double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(Double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public Double getMontoACobrar() {
        return montoACobrar;
    }

    public void setMontoACobrar(Double montoACobrar) {
        this.montoACobrar = montoACobrar;
    }
}
