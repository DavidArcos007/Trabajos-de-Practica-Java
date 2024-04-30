/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_004;

import Deber_003.*;

/**
 *
 * @author DELL 2019
 */
public class Rectangulo extends Figura {

    double ancho, alto;

    Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //Cálculo Área Rectángulo
    @Override
    double calcArea() {
        return (this.ancho * this.alto);
    }

    //Cálculo Perímetro Rectángulo 
    @Override
    double calcPerim() {
        return (2 * this.ancho + 2 * this.alto);
    }

}
