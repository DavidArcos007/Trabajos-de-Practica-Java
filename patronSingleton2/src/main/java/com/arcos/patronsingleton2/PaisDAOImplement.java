
package com.arcos.patronsingleton2;

import java.util.ArrayList;
import java.util.List;


public class PaisDAOImplement {
    private List paises = null;

    public List getPaises(){
        if(paises == null){
          
        paises = new ArrayList();
        Pais p1 = new Pais("Perú");
        Pais p2 = new Pais("Colombia");
        Pais p3 = new Pais("Ecuador");

        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        
        }
        
        return paises;
    }
}