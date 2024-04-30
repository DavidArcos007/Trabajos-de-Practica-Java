/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb.arbolGeneral;

/**
 *
 * @author felix
 */
public class NodoAG {
    Object dato;
    Lista hijos;
    
    NodoAG( Object dato ){
        this.dato = dato;
        this.hijos = new Lista();     
    }
    
}
