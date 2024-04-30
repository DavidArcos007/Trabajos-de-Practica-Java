/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhilvanado;

/**
 *
 * @author felix
 */
public class NodoAHilv {
    Object dato;
    NodoAHilv enlIzq, enlDer;
    boolean indiIzq, indiDer;
    
    NodoAHilv( Object dato ){
        this.dato = dato;
        this.indiIzq = this.indiDer = true;
        this.enlIzq = this.enlDer = null; 
    }
    
}
