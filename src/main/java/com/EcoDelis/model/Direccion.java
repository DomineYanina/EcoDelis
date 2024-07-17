package com.EcoDelis.model;

public class Direccion {
    private long id;
    private String calle;
    private int altura;
    private String e_calle_uno;
    private String e_calle_dos;
    private String CP;
    private String localidad;
    private Provincia provincia;

    public Direccion(long id, String calle, int altura, String e_calle_uno, String e_calle_dos, String CP, String localidad, Provincia provincia) {
        this.id = id;
        this.calle = calle;
        this.altura = altura;
        this.e_calle_uno = e_calle_uno;
        this.e_calle_dos = e_calle_dos;
        this.CP = CP;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getE_calle_uno() {
        return e_calle_uno;
    }

    public void setE_calle_uno(String e_calle_uno) {
        this.e_calle_uno = e_calle_uno;
    }

    public String getE_calle_dos() {
        return e_calle_dos;
    }

    public void setE_calle_dos(String e_calle_dos) {
        this.e_calle_dos = e_calle_dos;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
