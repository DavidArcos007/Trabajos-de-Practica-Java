/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marce
 */
public class Comida {
    private List<IItem> items = new ArrayList<IItem>(); 
    
    public void addItem(IItem item){
        items.add(item);
    }
    
    public float getCosto(){
        float costo = 0.0f;
        
        for(IItem item: items){
            costo+=item.getPrecio();
        }
        
        return costo;
    }
    
    public void mostrarItems(){
         for(IItem item: items){
         
             System.out.println("Item: "+item.getNombre());
              System.out.println("Empaque: "+item.embalaje().empaquetar());
              System.out.println("Precio: "+item.getPrecio());
         }
    }
}
