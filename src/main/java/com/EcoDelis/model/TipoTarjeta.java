package com.EcoDelis.model;

public enum TipoTarjeta {
    Credito,
    Debito;

    @Override
    public String toString() {

        switch (this) {
            case Credito:
                return "Crédito";
            case Debito:
                return "Débito";
            default:
                return super.toString();
        }
    }
}
