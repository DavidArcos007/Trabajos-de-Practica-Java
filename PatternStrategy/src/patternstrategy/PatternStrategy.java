package patternstrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternStrategy {

    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static Contexto contexto;

    public static void main(String[] args) throws IOException {
        //Contexto contexto = new Contexto(new AntivirusAvanzado());
        //contexto.ejecutar();

        System.out.println("Tipo De Analisis" + "\n"
                + "1.- Analisis Simple" + "\n"
                + "2.- Analisis Avanzado");
        System.out.println("Por favor Seleccione Una Opcion: ");
        String opcion = leer.readLine();
        if (opcion.equals("1")) {
            contexto = new Contexto(new AntivirusSimple());
        } else {
            contexto = new Contexto(new AntivirusAvanzado());
        }
        contexto.ejecutar();
    }

}
