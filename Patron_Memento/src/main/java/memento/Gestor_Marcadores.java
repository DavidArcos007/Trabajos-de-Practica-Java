/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;

/**
 *
 * @author JEAN5
 */
public class Gestor_Marcadores {

    private ArrayList<Memento> marcadores = new ArrayList<Memento>();

    public void addPosicionMarcador(Memento m) {
        marcadores.add(m);
    }

    public Memento getPosicionMarcador(int indice) {
        return marcadores.get(indice);
    }

}
