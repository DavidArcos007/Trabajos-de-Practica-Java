
package services;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Audit_Service {
    public void auditServiceUsed(String usuario, String servicio){
        SimpleDateFormat formatear = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println(usuario + "Utilizo El Servicio > " + servicio + "A Las " + formatear.format(new Date()));
        
    }
}
