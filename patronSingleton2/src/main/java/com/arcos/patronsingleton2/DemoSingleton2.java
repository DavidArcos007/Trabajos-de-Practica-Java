
package com.arcos.patronsingleton2;


public class DemoSingleton2 {

    public static void main(String[] args) {
        PaisDAOImplement dao = new PaisDAOImplement();

        for(Object obj: dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("***********************");
        for(Object obj: dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
      
        
    }

}