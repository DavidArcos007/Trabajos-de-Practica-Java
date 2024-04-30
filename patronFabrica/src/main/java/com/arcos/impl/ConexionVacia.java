
package com.arcos.impl;

import com.arcos.inter.IConexion;


public class ConexionVacia implements IConexion {

    @Override
    public void conectar() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR DE BASE DE DATOS");
    }

    @Override
    public void desconectar() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR DE ABSE DE DATOS");
    }
    
}
