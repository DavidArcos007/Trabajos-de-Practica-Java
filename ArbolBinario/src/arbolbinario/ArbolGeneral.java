/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author felix
 */
public class ArbolGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolG ag = new ArbolG();
        ag.raiz = new NodoAG(5);
        ag.raiz.hijos.insertar(new NodoAG(3));//hijo1
        //
        // insertar 2 hijos más de la raíz y 2 nietos de la raíz. 
        ag.raiz.hijos.insertar(new NodoAG(4));//hijo2
        ((NodoAG)ag.raiz.hijos.primero.dato).hijos.insertar(new NodoAG(15));
        ((NodoAG)ag.raiz.hijos.primero.dato).hijos.insertar(new NodoAG(18));
        // imprimir todos los valores con una sentencia cada uno.  
        System.out.println("Raiz = "+ag.raiz.dato);
        System.out.println("Hijo 1 = "+((NodoAG) (ag.raiz.hijos.primero.dato)).dato);
        System.out.println("Hijo 2 = "+((NodoAG) (ag.raiz.hijos.primero.siguiente.dato)).dato);
        System.out.println("Nieto 1 = "+ ((NodoAG)((NodoAG) (ag.raiz.hijos.primero.dato)).hijos.primero.dato).dato);
        System.out.println("Nieto 2 = "+ ((NodoAG)((NodoAG) (ag.raiz.hijos.primero.dato)).hijos.primero.siguiente.dato).dato);
        //
        //
        
    }

}
