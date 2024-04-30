package com.arcos.patronconstructorleccion;


public class CocinaDirector {
    private PizzaPatronBuilder builder;
 
    public void setPizzaBuilder(PizzaPatronBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }
    
    public Pizza getPizza() { 
        return builder.getPizza();
    }
 
    public void construirPizza() {
       builder.crearNuevaPizza();
       builder.buildMasa();
       builder.buildSalsa();
       builder.buildRelleno();
    }
}

