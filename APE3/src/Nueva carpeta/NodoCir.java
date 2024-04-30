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
public class NodoCir {

    private Circulo cir;
    private NodoCir sigue;

    NodoCir(Circulo cir, NodoCir sigue) {
        this.cir = cir;
        this.sigue = sigue;

    }

    public Circulo getCir() {
        return cir;
    }

    public void setCir(Circulo cir) {
        this.cir = cir;
    }

    public NodoCir getSigue() {
        return sigue;
    }

    public void setSigue(NodoCir sigue) {
        this.sigue = sigue;
    }
}
