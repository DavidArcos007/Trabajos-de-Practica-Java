
package com.arcos.patronfabricaabstracta2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FabricaNatural implements IFabricaAbstracta{
    
    private IProductoLeche leche;
    private IProductoSaborizante sabor;
    
    @Override
    public void crearProductos() {
       String seleccion;
        System.out.println(" Estamos creando tu bebida ");
        System.out.println(" Leche: 1) Almendras, 2) Coco ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
       
        try {
            System.out.print(" Ingresa tu selección: ");
            seleccion = br.readLine();
            if("1".equals(seleccion)){
                leche = new LecheAlmendras();
            }else{
                leche = new LecheCoco();
            }
            System.out.println(" Ahora extraemos el sabor ");
        sabor = new SaborVainilla();
        sabor.gets();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
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
