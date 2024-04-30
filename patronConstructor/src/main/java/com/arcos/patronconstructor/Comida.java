
package com.arcos.patronconstructor;

import java.util.ArrayList;
import java.util.List;


public class Comida {
    private List<IItem> items = new ArrayList<IItem>();
    
    public void addItem(IItem item){
        items.add(item);
    }
    public float getCosto(){
        float costo = 0.0f;
        
        for(IItem item:items){
            costo+=item.getPrecio();
        }
        
        return costo;
    }
    public void mostraItems(){
        for(IItem item:items){
            System.out.println("Item: "+item.getNombre());
            System.out.println("Empaque: "+item.embalaje().empaquetar());
            System.out.println("Precio: "+item.getPrecio());
            
        }
    }
}
