/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.patronbuilder;

/**
 *
 * @author marce
 */
public class Agua extends BebidaFria {

    @Override
    public String getNombre() {
        return "Agua sin gas";
    }

    @Override
    public float getPrecio() {
        return 0.5f;
    }

}
