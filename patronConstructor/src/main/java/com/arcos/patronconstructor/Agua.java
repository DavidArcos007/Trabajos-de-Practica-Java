
package com.arcos.patronconstructor;


public class Agua extends BebidaFria{
    @Override
    public float getPrecio() {
        return 0.75f;
    }

    @Override
    public String getNombre() {
        return "Agua sin gas";
    }
}
