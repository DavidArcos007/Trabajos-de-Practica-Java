
package com.arcos.patronprototypeleccion;


public class CCuadrado implements IPrototipo {

    private String color;
    private int area;

    public CCuadrado(String nom, int area) {
        this.color = nom;
        this.area = area;
    }
    //get y set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    //override

    @Override
    public String toString() {
        return "Cuadrado - " + " color: " + color + ", area: " + area ;

    }

    @Override
    public Object clone() {
        CCuadrado clone = new CCuadrado(color, area);
        return clone;
    }
}
