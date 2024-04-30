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
public class ListaCua {

    private NodoCua primero;
    private NodoCua ultimo;

    public ListaCua() {
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


    public void insertar(Cuadrado c1) {

        NodoCua momento;
        if (saberLista()) {
            momento = new NodoCua(c1, null);
            primero = momento;
            ultimo = momento;
        } else {
            momento = new NodoCua(c1, null);
            ultimo.setSigue(momento);
            ultimo = momento;
        }

    }

 
    public void visualizarÁrea() {
        NodoCua aux = primero;
        System.out.print(aux.getCua().calcArea());
        aux = aux.getSigue();

    }


    public void visualizarPerim() {
        NodoCua aux = primero;
        System.out.print(aux.getCua().calcPerim());
        aux = aux.getSigue();
      
    }

}
