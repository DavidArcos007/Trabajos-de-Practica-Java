
package com.mateo.factory;

import com.mateo.impl.ConexionMySQL;
import com.mateo.impl.ConexionOracle;
import com.mateo.impl.ConexionPostgreSQL;
import com.mateo.impl.ConexionVacia;
import com.mateo.interfaz.IConexion;


public class ConexionFabrica {
    
    public IConexion metodoFabrica(String motorBD){
        if (motorBD == null) {
            return new ConexionVacia();
        }
        if (motorBD.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motorBD.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motorBD.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else {
            return new ConexionVacia();
        }
    }
    
}
