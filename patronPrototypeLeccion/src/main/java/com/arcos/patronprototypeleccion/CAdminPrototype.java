
package com.arcos.patronprototypeleccion;

import java.util.Hashtable;


public class CAdminPrototype {
 
    private final Hashtable<String, IPrototipo> prototypes = new Hashtable<String, IPrototipo>();

    public CAdminPrototype() {

        CCuadrado cuad1 = new CCuadrado("azul", 24);
        prototypes.put("Cuadrado", cuad1);
        
        CRectangulo rec1=new CRectangulo("Paralelogramo", 14);
        prototypes.put("Rectangulo", rec1);
        
    }
    public void adcionarPrototipos(String llave, IPrototipo pPrototipo) {

        prototypes.put(llave, pPrototipo);
    }
    public Object obtenerPrototipo(String pLlave) {

        return prototypes.get(pLlave).clone();
    }
}
