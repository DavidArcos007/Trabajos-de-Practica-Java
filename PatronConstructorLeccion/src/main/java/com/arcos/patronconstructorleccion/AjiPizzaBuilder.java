package com.arcos.patronconstructorleccion;


public class AjiPizzaBuilder extends PizzaPatronBuilder {

    @Override
    public void buildMasa() {
         pizza.setMasa("cocida"); 
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchichón"); 
    }

}
   