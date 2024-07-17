package com.EcoDelis.model;

public class Telefono {
    private long id;
    private long numero;
    private String codigoDeArea;
    private TipoTelefono tipoTelefono;
    private boolean principal;

    public Telefono(long id, long numero, String codigoDeArea, TipoTelefono tipoTelefono, boolean principal) {
        this.id = id;
        this.numero = numero;
        this.codigoDeArea = codigoDeArea;
        this.tipoTelefono = tipoTelefono;
        this.principal = principal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(String codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
    }

    public TipoTelefono getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(TipoTelefono tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }
}
