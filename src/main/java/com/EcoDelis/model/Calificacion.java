package com.EcoDelis.model;

public class Calificacion {
    private long id;
    private Integer puntaje;
    private String comentario;

    public Calificacion(long id, Integer puntaje, String comentario) {
        this.id = id;
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
