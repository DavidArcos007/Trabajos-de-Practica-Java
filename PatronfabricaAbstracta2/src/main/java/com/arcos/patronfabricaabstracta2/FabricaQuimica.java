
package com.arcos.patronfabricaabstracta2;


public class FabricaQuimica implements IFabricaAbstracta{
    private IProductoLeche leche;
    private IProductoSaborizante sabor;

    @Override
    public void crearProductos() {
        System.out.println(" Estamos produciendo tu malteada ");
        leche = new LecheVaca();
        sabor = new SaborChocolate();
    }

    @Override
    public IProductoLeche getProductoLeche() {
        return leche;
    }

    @Override
    public IProductoSaborizante getProductoSabor() {
       return sabor;
    }
    
}
