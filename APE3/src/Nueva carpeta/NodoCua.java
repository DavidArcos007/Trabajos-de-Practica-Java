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
public class NodoCua {

    private Cuadrado cua;
    private NodoCua sigue;

    NodoCua(Cuadrado cua,NodoCua sigue) {
        this.cua = cua;
        this.sigue = sigue;

    }

   
    public Cuadrado getCua() {
        return cua;
    }

   
    public void setCua(Cuadrado cua) {
        this.cua = cua;
    }

  
    public NodoCua getSigue() {
        return sigue;
    }

   
    public void setSigue(NodoCua sigue) {
        this.sigue = sigue;
    }
}
