
package com.arcos.factory;

import com.arcos.impl.ConexionMySQL;
import com.arcos.impl.ConexionOracle;
import com.arcos.impl.ConexionPostgreSQL;
import com.arcos.impl.ConexionVacia;

import com.arcos.inter.IConexion;


public class ConexionFabrica {
    public IConexion metodoFabrica(String motor){
        if(motor == null){
            return new ConexionVacia();
        }
        if(motor.equalsIgnoreCase("MySQL")){
            return new ConexionMySQL();
        }else if (motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }else if(motor.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSQL();
        }else          
            return new ConexionVacia();
        }
}

