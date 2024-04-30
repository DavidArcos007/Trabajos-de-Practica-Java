/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_004;

/**
 *
 * @author DELL 2019
 */
public class ListaRec {

    private NodoRec primero;
    private NodoRec ultimo;

    public ListaRec() {
        primero = null;
        ultimo =  null;
    }


    public boolean saberLista() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }


    public void insertar(Rectangulo rec1) {

        NodoRec momento;
        if (saberLista()) {
            momento = new NodoRec(rec1, null);
            primero = momento;
            ultimo = momento;
        } else {
            momento = new NodoRec(rec1, null);
            ultimo.setSigue(momento);
            ultimo = momento;
        }

    }


    public void visualizarÁrea() {
        NodoRec aux = primero;
        System.out.print(aux.getRec().calcArea());
        aux = aux.getSigue();

    }

    public void visualizarPerim() {
        NodoRec aux = primero;
        System.out.print(aux.getRec().calcPerim());
        aux = aux.getSigue();

    }
}
