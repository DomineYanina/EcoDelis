package com.EcoDelis.model;

import java.sql.Time;

public class Sucursal {
    private long id;
    private String alias;
    private Time horarioApertura;
    private Time horarioCierre;
    private boolean activa;
    private Double puntaje;

    public Sucursal(long id, String alias, Time horarioApertura, Time horarioCierre, boolean activa, Double puntaje) {
        this.id = id;
        this.alias = alias;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.activa = activa;
        this.puntaje = puntaje;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Time getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(Time horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public Time getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(Time horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }
}
