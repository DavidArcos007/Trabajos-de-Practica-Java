package com.arcos.patronconstructorleccion;


public class PiniaPizzaBuilder extends PizzaPatronBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("chorizo+alcachofas"); 
    }
}