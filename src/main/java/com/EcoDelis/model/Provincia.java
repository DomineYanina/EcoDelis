package com.EcoDelis.model;

public enum Provincia {
    BUENOS_AIRES,
    CATAMARCA,
    CHACO,
    CHUBUT,
    CORDOBA,
    CORRIENTES,
    ENTRE_RIOS,
    FORMOSA,
    JUJUY,
    LA_PAMPA,
    LA_RIOJA,
    MENDOZA,
    MISIONES,
    NEUQUEN,
    RIO_NEGRO,
    SALTA,
    SAN_JUAN,
    SAN_LUIS,
    SANTA_CRUZ,
    SANTA_FE,
    SANTIAGO_DEL_ESTERO,
    TIERRA_DEL_FUEGO,
    TUCUMAN;

    @Override
    public String toString() {
        // Override the toString method to display the names in a more readable format
        switch (this) {
            case BUENOS_AIRES:
                return "Buenos Aires";
            case CATAMARCA:
                return "Catamarca";
            case CHACO:
                return "Chaco";
            case CHUBUT:
                return "Chubut";
            case CORDOBA:
                return "Córdoba";
            case CORRIENTES:
                return "Corrientes";
            case ENTRE_RIOS:
                return "Entre Ríos";
            case FORMOSA:
                return "Formosa";
            case JUJUY:
                return "Jujuy";
            case LA_PAMPA:
                return "La Pampa";
            case LA_RIOJA:
                return "La Rioja";
            case MENDOZA:
                return "Mendoza";
            case MISIONES:
                return "Misiones";
            case NEUQUEN:
                return "Neuquén";
            case RIO_NEGRO:
                return "Río Negro";
            case SALTA:
                return "Salta";
            case SAN_JUAN:
                return "San Juan";
            case SAN_LUIS:
                return "San Luis";
            case SANTA_CRUZ:
                return "Santa Cruz";
            case SANTA_FE:
                return "Santa Fe";
            case SANTIAGO_DEL_ESTERO:
                return "Santiago del Estero";
            case TIERRA_DEL_FUEGO:
                return "Tierra del Fuego";
            case TUCUMAN:
                return "Tucumán";
            default:
                return super.toString();
        }
    }
}

