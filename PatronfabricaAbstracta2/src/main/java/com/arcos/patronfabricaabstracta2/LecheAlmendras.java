
package com.arcos.patronfabricaabstracta2;


public class LecheAlmendras implements IProductoLeche {

    @Override
    public void producir() {
        System.out.println(" Procesando las Almendras ");
    }

    @Override
    public String getDatos() {
        return " Leche organica de almendras, 250ml ";
    }
    
}
