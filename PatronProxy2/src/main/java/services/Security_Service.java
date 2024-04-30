
package services;


public class Security_Service {

    public boolean authorization(String usuario, String clave) {
        if (usuario.equals("david") && clave.equals("12345")) {
            System.out.println("Usuario" + usuario + "autorizado");
            return true;
        } else {
            System.out.println("Usuario" + usuario + "No autorizado");
        }
        return false;
    }

}
