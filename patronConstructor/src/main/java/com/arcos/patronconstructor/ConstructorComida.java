
package com.arcos.patronconstructor;


public class ConstructorComida {
    public Comida prepararComidaVeg(){
        Comida comida = new Comida();
        comida.addItem(new Hamburguesaveg());
        comida.addItem((IItem) new Agua());
        return comida;
    }
    
    public Comida prepararComidaNoVeg(){
        Comida comida = new Comida();
        comida.addItem(new HamburguesaPollo());
        comida.addItem((IItem) new Cola());
        return comida;
    }
}
