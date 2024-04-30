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
public class BuilderComida {
    public Comida prepararComidaVeg(){
        Comida comida = new Comida();
        comida.addItem(new HamburguesaVeg());
        comida.addItem(new Agua());
        
        return comida;
    }
    
    public Comida prepararComidaNoVeg(){
        Comida comida1 = new Comida();
        comida1.addItem(new HamburguesaPollo());
        comida1.addItem(new Gaseosa());
        
        return comida1;
    }
}
