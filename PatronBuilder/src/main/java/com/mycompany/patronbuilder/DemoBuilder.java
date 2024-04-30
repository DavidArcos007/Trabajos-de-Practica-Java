/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder;

/**
 *
 * @author marce
 */
public class DemoBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BuilderComida contructor = new BuilderComida();
       
       Comida comidaVeg = contructor.prepararComidaVeg();
        System.out.println("Comida Vegetariana");
        comidaVeg.mostrarItems();
        System.out.println("Costo total: "+comidaVeg.getCosto());
        
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("");
        
        Comida comidaNoVeg = contructor.prepararComidaNoVeg();
        System.out.println("Comida No Vegetariana");
        comidaNoVeg.mostrarItems();
        System.out.println("Costo total: "+comidaNoVeg.getCosto());
    }
    
}
