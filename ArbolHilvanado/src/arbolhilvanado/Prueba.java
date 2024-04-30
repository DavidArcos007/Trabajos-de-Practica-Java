/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhilvanado;

/**
 *
 * @author david
 */
public class Prueba {
    public static void main(String[] args) {
        ArbolHilv f = new ArbolHilv();
        f.insertarEnteros(1);
        f.insertarEnteros(3);
        
      
        System.out.println(f.raíz.dato);
        //f.imprimirSimetrico();
    }
}
