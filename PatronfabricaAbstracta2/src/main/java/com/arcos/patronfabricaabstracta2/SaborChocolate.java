
package com.arcos.patronfabricaabstracta2;


public class SaborChocolate implements IProductoSaborizante{

    @Override
    public void gets() {
        System.out.println(" Se produce C7H8N402 ");
    }

    @Override
    public String informacion() {
        return " Sabor Artificial a chocolate ";
    }
    
}
