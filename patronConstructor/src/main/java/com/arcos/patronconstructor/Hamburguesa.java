
package com.arcos.patronconstructor;


public abstract class Hamburguesa implements IItem{
    public IEmbalaje embalaje(){
        return new Empaque();
    }
    
    @Override
    public abstract float getPrecio();
}
