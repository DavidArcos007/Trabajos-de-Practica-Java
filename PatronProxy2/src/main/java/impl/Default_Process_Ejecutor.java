
package impl;

import inter.I_Process_Ejecutor;


public class Default_Process_Ejecutor implements I_Process_Ejecutor{

    @Override
    public void ejercuteProcess(int idProceso, String usuario, String clave) throws Exception {
        System.out.println("Proceso " + idProceso + "en ejecucion ...");
        System.out.println("Proceso " + idProceso + "terminado ...");
        
    }
    
    
    
    
}
