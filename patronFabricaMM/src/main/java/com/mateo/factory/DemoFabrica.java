

package com.mateo.factory;

import com.mateo.interfaz.IConexion;
import javax.swing.JOptionPane;


public class DemoFabrica {

    
    public static void main(String[] args) {
        
        ConexionFabrica fabrica = new ConexionFabrica();
        String motorBD = JOptionPane.showInputDialog("Introducir el motor de BD a utilizar", args);
        IConexion cx1 = fabrica.metodoFabrica(motorBD);
        cx1.conectar();
        cx1.desconectar();
    }
    
}
