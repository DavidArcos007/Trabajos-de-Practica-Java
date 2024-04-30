/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Usuario
 */
public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numPagina;

    //METODO COSTRUCTOR    asigna el contenido 
    public Libro(int pISBN, String pitulo, String pautor, int pnumPaginas) {
        ISBN = pISBN;
        titulo = pitulo;
        autor = pautor;
        numPagina = pnumPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tÃ­tulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return titulo + "El Libro " + " con ISN " + ISBN + ""
                + " creado por el autor " + autor
                + " tiene " + numPagina + " paginas ";
    }

}
