package com.arcos.patronprototypeleccion;

public class CRectangulo implements IPrototipo {

    private String tipo;
    private int area;

    public CRectangulo(String modelo, int area) {
        this.tipo = modelo;
        this.area = area;
    }
    //get y set
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //override
    @Override
    public String toString() {
        return "Rectangulo - " + " tipo: " + tipo + " , area: " + area;
    }

    @Override
    public Object clone() {
        CRectangulo clone = new CRectangulo(tipo, area);
        return clone;
    }
}
