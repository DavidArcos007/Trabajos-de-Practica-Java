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
public class Libro {

    private int pagina_actual;

    public void irPagina(int pagina) {
        this.pagina_actual = pagina;
        System.out.println("Agregado Marcador En Página [" + this.pagina_actual + "]");
    }

    public Memento guardarMarcador() {
        System.out.println("El Marcador Fue Guardado");
        return new Memento(this.pagina_actual);
    }

    public void recuperarPagina(Memento m) {
        this.pagina_actual = m.getMarcadorPagina();
        System.out.println("Volvemos a la Página: " + pagina_actual);
    }
}
