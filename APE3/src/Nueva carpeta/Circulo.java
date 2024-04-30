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
public class Circulo extends Figura {

    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    //Cálculo Área Círculo
    @Override
    double calcArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    //Cálculo Perímetro Círculo
    @Override
    double calcPerim() {
        return (2 * Math.PI * this.radio);
    }

}
