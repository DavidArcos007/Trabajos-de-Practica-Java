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
public class Cuadrado extends Figura {

    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    //Cálculo Área Cuadrado
    @Override
    double calcArea() {
        return Math.pow(this.lado, 2);
    }

    //Cálculo Perímetro Cuadrado 
    @Override
    double calcPerim() {
        return (this.lado * 4);
    }

}
