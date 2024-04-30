package authenticationestrategy;

import impl.AuthenticationProvider;
import impl.Principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import provides.*;

/**
 *
 * @author Lenovo
 */
public class StrategyMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AuthenticationProvider contexto;
        contexto = new AuthenticationProvider();
        char pregunta;
        String usuario, password;

        do {
            System.out.println("Tipo de Auntetificacion a utilizar:" + "\n"
                    + "1. OnMemory Authentication" + "\n"
                    + "2. SQL Authentication" + "\n"
                    + "3. XML Authentication" + "\n");
            System.out.print("Por favor, Seleccione una opción: ");
            String opcion = reader.readLine();
            if (opcion.equals("1")) {
                System.out.println("Authentication OnMemory selecionada =>");
                contexto.setAuthenticationStrategy(new OnMemoryAuthenticationProvider());
            } else if (opcion.equals("2")) {
                System.out.println("Authentication SQL selecionada =>");
                contexto.setAuthenticationStrategy(new SQLAuthenticationProvier());
            } else if (opcion.equals("3")) {
                System.out.println("Authentication XML selecionada =>");
                contexto.setAuthenticationStrategy(new XMLAuthenticationProvider());
            }
            System.out.println("");
            System.out.println("Favor autenticarse:");
            System.out.print("Usuartio: ");
            usuario = reader.readLine();
            System.out.print("Contraseña: ");
            password = reader.readLine();
            Principal p1 = contexto.authenticate(usuario, password);
            if(p1!=null){
                System.out.println("Autentificación Exitosa!.");
                System.out.println(p1.toString());
                pregunta = 'N';
            }else{
                System.out.println("Usuario o Contraseña Invalidos..");
                System.out.printf("%25s%s", "", "Desea cambiar el Método de autenticación? (S/N) = ");
                pregunta = reader.readLine().toUpperCase().charAt(0);
            }
            
            
        } while (pregunta == 'S');
    }
}
