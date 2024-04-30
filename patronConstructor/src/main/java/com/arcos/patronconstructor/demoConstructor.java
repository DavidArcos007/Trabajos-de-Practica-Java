
package com.arcos.patronconstructor;


public class demoConstructor {

   
    public static void main(String[] args) {
      ConstructorComida constructor = new ConstructorComida();
      
      Comida comidaVeg = constructor.prepararComidaVeg();
        System.out.println("Comida Vegetariana");
        comidaVeg.mostraItems();
        System.out.println("Costo Total: "+comidaVeg.getCosto());
        
        System.out.println("*************************************************");
        
        Comida comidaNoVeg = constructor.prepararComidaNoVeg();
        System.out.println("Comida No Vegetariana");
        comidaNoVeg.mostraItems();
        System.out.println("Costo Total: "+comidaNoVeg.getCosto());
    }
    
}
