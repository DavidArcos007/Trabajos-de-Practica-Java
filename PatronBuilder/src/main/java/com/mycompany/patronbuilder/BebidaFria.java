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
public abstract class BebidaFria implements IItem{
    
    public IEmbalaje embalaje(){
        return new Botella();
    }
    
     public abstract float getPrecio();
}
