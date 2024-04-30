
package com.arcos.patronfabricaabstracta2;


public class demoFabricaAbstracta2 {

 
    public static void main(String[] args) {
        System.out.println("--------- Fabrica Quimica ---------");
        
        IFabricaAbstracta miFabrica = new  FabricaQuimica();
        miFabrica.crearProductos();
        
        IProductoLeche miLeche = miFabrica.getProductoLeche();
        IProductoSaborizante miSaborizante = miFabrica.getProductoSabor();
        
        miLeche.producir();
        miSaborizante.gets(); 
        
        
        System.out.println("Mi Bebida es de: "+ miLeche.getDatos() + "Y" + miSaborizante.informacion());
        
         System.out.println("--------- Fabrica Natural ---------");
        
        IFabricaAbstracta miFabrica1 = new  FabricaNatural();
        miFabrica1.crearProductos();
        
        IProductoLeche miLeche1 = miFabrica.getProductoLeche();
        IProductoSaborizante miSaborizante1 = miFabrica1.getProductoSabor();
        
        miLeche1.producir();
        miSaborizante1.gets(); 
        
        System.out.println("Mi Bebida es de: "+ miLeche1.getDatos() + "Y" + miSaborizante1.informacion());
    }
}
