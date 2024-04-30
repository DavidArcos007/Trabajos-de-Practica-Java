
package com.arcos.patronfabricaabstracta2;


public class SaborVainilla implements IProductoSaborizante{
    
      @Override
    public void gets() {
        System.out.println(" Se extra las Vainas ");
    }

    @Override
    public String informacion() {
        return " Extracto de Vanilla Natural ";
    }
}
