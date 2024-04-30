/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author JEAN5
 */
public class Demo_Memento {

    public static void main(String[] args) {
        Gestor_Marcadores objGestor_Marcadores = new Gestor_Marcadores();

        System.out.printf("%30s\n\n","Patrón Memento");
        // Abrimos el libro y vamos a la página 10
        Libro libro = new Libro();
        libro.irPagina(10);

        // Guardamos la página en marcadores
        objGestor_Marcadores.addPosicionMarcador(libro.guardarMarcador());

        // Saltamos a la página 83
        libro.irPagina(83);

        // Guardamos la página en marcadores
        objGestor_Marcadores.addPosicionMarcador(libro.guardarMarcador());

        System.out.println("*************************************");
        // Volvemos a la primera página guardada en marcadores
        libro.recuperarPagina(objGestor_Marcadores.getPosicionMarcador(0));

        // Saltamos a la segunda página guardada en marcadores
        libro.recuperarPagina(objGestor_Marcadores.getPosicionMarcador(1));
    }

}
