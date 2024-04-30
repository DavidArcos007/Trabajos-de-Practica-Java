
package com.arcos.patronfabricaabstracta2;


public class LecheCoco implements IProductoLeche{

    @Override
    public void producir() {
        System.out.println(" Pelando los cocos ");
    }

    @Override
    public String getDatos() {
        return " Leche de coco, 250ml ";
    }
    
}
