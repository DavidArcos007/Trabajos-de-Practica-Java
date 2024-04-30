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
public interface IItem {
    
    public String getNombre();
    public IEmbalaje embalaje();
    public float getPrecio();
}
