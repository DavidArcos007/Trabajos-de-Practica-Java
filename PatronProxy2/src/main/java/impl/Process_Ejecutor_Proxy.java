
package impl;

import inter.I_Process_Ejecutor;
import services.Audit_Service;
import services.Security_Service;


public class Process_Ejecutor_Proxy implements I_Process_Ejecutor {
    
    @Override
    public void ejercuteProcess(int idProceso, String usuario, String clave) throws Exception {
        Security_Service securityService = new Security_Service();
        if (!securityService.authorization(usuario, clave)) {
            throw new Exception("El Usuario '" + usuario + "' no tiene privilegios para ejecutar el proceso");
            
        }
        
        Default_Process_Ejecutor ejecutorProcesos = new Default_Process_Ejecutor();        
        ejecutorProcesos.ejercuteProcess(idProceso, usuario, clave);
        
        Audit_Service audit = new Audit_Service(); 
        audit.auditServiceUsed(usuario, Default_Process_Ejecutor.class.getName());
        
    }
    
}
