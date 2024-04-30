/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb.arbolBinario;

/**
 *
 * @author felix
 */
public class NodoABin {
    Object dato;
    NodoABin enlIzq, enlDer;
    
    NodoABin( Object dato ){
        this.dato = dato;
        this.enlIzq = this.enlDer = null; 
    }
}
