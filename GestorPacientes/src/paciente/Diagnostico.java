/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author DELL
 */
public class Diagnostico {

    public static String diagnosticos[] = {"Caries", "Maloclusión",
        "Traumatismos dentales",
        "Lesiones de la mucosa oral",
        "Exodoncia o extracción"};

    static String obtenerDiagnostico() {
        return diagnosticos[aleatorio()];
    }

    static int aleatorio() {
        int aleatorio = (int) (Math.random() * (diagnosticos.length));
        return aleatorio;
    }

}
