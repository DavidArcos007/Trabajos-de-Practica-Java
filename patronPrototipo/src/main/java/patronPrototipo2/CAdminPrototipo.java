
package patronPrototipo2;

import java.util.Hashtable;


public class CAdminPrototipo {
    private final Hashtable<String, IPrototipo> prototipos = new Hashtable<String,IPrototipo>();
      
    public CAdminPrototipo(){
        CPersona persona = new CPersona("Juan",18);
        prototipos.put("Persona", persona);
        
        CValores valores = new CValores(1);
        prototipos.put("Valores", valores);
    }
    
    public void adicionarPrototipo(String llave, IPrototipo prototipo){
        prototipos.put(llave, prototipo);
    }
    
    public Object ObtenerPrototipos(String llave){
        return prototipos.get(llave).clonar();
    }
}
