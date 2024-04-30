
package com.arcos.factory;

import com.arcos.inter.IConexion;
import javax.swing.JOptionPane;

public class DemoFabrica {

 
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();
        String motor = JOptionPane.showInputDialog("Introducir el motor");
        IConexion cx1 = fabrica.metodoFabrica(motor);
        cx1.conectar();
        cx1.desconectar();
        
         IConexion cx2 = fabrica.metodoFabrica(motor);
        cx2.conectar();
        cx2.desconectar();
    }
    
}
