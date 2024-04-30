
package com.arcos.patronconstructor;


public abstract class BebidaFria implements IItem{
    public IEmbalaje embalaje(){
        return new Botella();
    }
    public abstract float getPrecio();
}