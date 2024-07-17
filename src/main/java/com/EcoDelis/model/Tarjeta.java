package com.EcoDelis.model;

import java.util.Date;

public class Tarjeta {
    private long id;
    private TipoTarjeta tipo;
    private String nombreTitular;
    private long numero;
    private Date fvenc;
    private Banco banco;

    public Tarjeta(long id, TipoTarjeta tipo, String nombreTitular, long numero, Date fvenc, Banco banco) {
        this.id = id;
        this.tipo = tipo;
        this.nombreTitular = nombreTitular;
        this.numero = numero;
        this.fvenc = fvenc;
        this.banco = banco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoTarjeta getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarjeta tipo) {
        this.tipo = tipo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getFvenc() {
        return fvenc;
    }

    public void setFvenc(Date fvenc) {
        this.fvenc = fvenc;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
