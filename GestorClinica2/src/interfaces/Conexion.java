/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {
    Connection connect = null;
    public Connection conectar(){
        try {
            //middleware
            Class.forName("com.mysql.jdbc.Driver");
            // de donde saco la conexion, usuario, clave
            connect=DriverManager.getConnection("jdbc:mysql://localhost/gestor_clinica","root","");
            //JOptionPane.showMessageDialog(null, "Ok, conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connect;
    }
            
}
