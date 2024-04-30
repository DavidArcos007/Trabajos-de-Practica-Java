
package App;

import impl.Service_Factory;
import inter.I_Process_Ejecutor;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main_Proxy {

   
    public static void main(String[] args) {

        String usuario = "david";
        String clave = "12345";
        int proceso = 1;
        
        I_Process_Ejecutor processEjecutor = Service_Factory.create_Process_Ejecutor();
        try {
            processEjecutor.ejercuteProcess(proceso, usuario, clave);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

}
