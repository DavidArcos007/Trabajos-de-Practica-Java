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
public class NodoRec {

    private Rectangulo rec;
    private NodoRec sigue;

    NodoRec(Rectangulo rec, NodoRec sigue) {
        this.rec = rec;
        this.sigue = sigue;

    }

    public Rectangulo getRec() {
        return rec;
    }

    public void setRec(Rectangulo rec) {
        this.rec = rec;
    }

    public NodoRec getSigue() {
        return sigue;
    }

    public void setSigue(NodoRec sigue) {
        this.sigue = sigue;
    }
}
