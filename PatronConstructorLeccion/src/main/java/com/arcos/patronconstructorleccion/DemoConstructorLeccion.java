

package com.arcos.patronconstructorleccion;


public class DemoConstructorLeccion {

    public static void main(String[] args) {
        //demo de pizza 
        CocinaDirector cocina = new CocinaDirector(); 

        PizzaPatronBuilder piniaPizzaBuilder = new PiniaPizzaBuilder();
        System.out.println("Pizza Hawaiana ");
        
        PizzaPatronBuilder picantePizzaBuilder = new AjiPizzaBuilder();
        System.out.println("Pizza Picante");

        cocina.setPizzaBuilder(piniaPizzaBuilder);

        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
    }
}

