
package com.arcos.impl;

import com.arcos.inter.IConexion;


public class ConexionPostgreSQL implements IConexion {
       private String host;
    private String puerto;
    private String usuario;
    private String contrasena;
    
    public ConexionPostgreSQL(){
        this.host = "localhost";
        this.puerto = "5433";
        this.usuario = "postgres";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede ir codigo JDBC
        System.out.println("Se conecto a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de PosgreSQL");
    }

    @Override
    public String toString() {
        return "ConexionPostgreSQL{" + "host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
}
