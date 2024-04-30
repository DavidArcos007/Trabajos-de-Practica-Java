
package com.arcos.impl;

import com.arcos.inter.IConexion;

public class ConexionMySQL implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionMySQL(){
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de MySQL");
    }

    @Override
    public String toString() {
        return "ConexionMySQL{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
}
