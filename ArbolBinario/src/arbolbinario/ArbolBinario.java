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
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBin abin = new ArbolBin();
        abin.raiz = new NodoABin(5);
        abin.raiz.enlIzq = new NodoABin(3);
        abin.raiz.enlDer = new NodoABin(6);
        System.out.println(abin.raiz.dato);
        System.out.println(abin.raiz.enlIzq.dato);
        //
        abin.raiz.enlIzq.enlIzq = new NodoABin(10);
        abin.raiz.enlDer.enlIzq = new NodoABin(12);
        abin.raiz.enlIzq.enlDer = new NodoABin(11);
        abin.raiz.enlDer.enlDer = new NodoABin(13);
        //
        System.out.println(abin.raiz.enlIzq.enlIzq.dato);
        System.out.println(abin.raiz.enlDer.enlIzq.dato);
        System.out.println(abin.raiz.enlIzq.enlDer.dato);
        System.out.println(abin.raiz.enlDer.enlDer.dato);

    }

}
