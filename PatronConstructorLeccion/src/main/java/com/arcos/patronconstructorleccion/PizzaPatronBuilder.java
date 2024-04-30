package com.arcos.patronconstructorleccion;


public abstract class PizzaPatronBuilder {
    protected Pizza pizza;
        // metodo get
    public Pizza getPizza() { 
        return pizza; 
    }
     // crear Nueva pizza
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }
 
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}