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
public class ListaCir {

    private NodoCir primero;
    private NodoCir ultimo;

    public ListaCir() {
        primero = null;
        ultimo = null;
    }

    public boolean saberLista() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }


    public void insertar(Circulo cir1) {

        NodoCir momento;
        if (saberLista()) {
            momento = new NodoCir(cir1, null);
            primero = momento;
            ultimo = momento;
        } else {
            momento = new NodoCir(cir1, null);
            ultimo.setSigue(momento);
            ultimo = momento;
        }

    }

    public void visualizarÁrea() {
        NodoCir aux = primero;
        System.out.print(aux.getCir().calcArea());
        aux = aux.getSigue();

    }


    public void visualizarPerim() {
        NodoCir aux = primero;
        System.out.print(aux.getCir().calcPerim());
        aux = aux.getSigue();

    }

}
