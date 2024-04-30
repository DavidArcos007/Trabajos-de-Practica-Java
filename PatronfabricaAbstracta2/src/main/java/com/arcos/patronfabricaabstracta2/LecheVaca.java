
package com.arcos.patronfabricaabstracta2;


public class LecheVaca implements IProductoLeche {
    @Override
    public void producir() {
        System.out.println(" Ordeñar la vaca en la granja y pasteurizar la Leche ");
    }

    @Override
    public String getDatos() {
        return " Carton de Leche de Vaca, 250ml ";
    }
    
}
