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
public class Ejercicio1_POO {

    public static void main(String[] args) {
        Libro libro1 = new Libro(13579, " La soledad de un cuerpo acostumbrado a la herida ", " Elvira Sastre ", 10);
        Libro libro2 = new Libro(24680, " Baluarte ", " Elvira Sastre ", 250);
        Libro libro3 = new Libro(12345, " 100 Anios de Soledad", " Gabriel Garcia Marques ", 100);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println("");
        System.out.println("");

        if (libro1.getNumPagina() > libro2.getNumPagina() && libro1.getNumPagina() > libro3.getNumPagina()) {
            if (libro2.getNumPagina() > libro3.getNumPagina()) {
                System.out.println(libro1.getTitulo() + " tiene mas paginas " + "que..."
                        + libro2.getTitulo() + " y que el libro " + libro3.getTitulo() + "; y el libro " + libro2.getTitulo()
                        + " tiene mas paginas que el libro " + libro3.getTitulo());
            } else {
                System.out.println(libro1.getTitulo() + " tiene mas paginas " + "que..."
                        + libro3.getTitulo() + " y que el libro " + libro2.getTitulo() + "; y el libro " + libro3.getTitulo()
                        + " tiene mas paginas que el libro " + libro2.getTitulo());

            }
        } else {
            if (libro2.getNumPagina() > libro1.getNumPagina() && libro2.getNumPagina() > libro3.getNumPagina()) {
                if (libro1.getNumPagina() > libro3.getNumPagina()) {
                    System.out.println(libro2.getTitulo() + " tiene mas paginas " + "que..."
                            + libro1.getTitulo() + " y que el libro " + libro3.getTitulo() + "; y el libro " + libro1.getTitulo()
                            + " tiene mas paginas que el libro " + libro3.getTitulo());
                } else {
                    System.out.println(libro2.getTitulo() + " tiene mas paginas " + "que..."
                            + libro3.getTitulo() + " y que el libro " + libro1.getTitulo() + "; y el libro " + libro3.getTitulo()
                            + " tiene mas paginas que el libro " + libro1.getTitulo());
                }
            } else {
                if (libro3.getNumPagina() > libro2.getNumPagina() && libro3.getNumPagina() > libro1.getNumPagina()) {
                    if (libro1.getNumPagina() > libro2.getNumPagina()) {
                        System.out.println(libro3.getTitulo() + " tiene mas paginas " + "que..."
                                + libro1.getTitulo() + " y que el libro " + libro2.getTitulo() + "; y el libro " + libro1.getTitulo()
                                + " tiene mas paginas que el libro " + libro2.getTitulo());
                    } else {
                        System.out.println(libro3.getTitulo() + " tiene mas paginas " + "que..."
                                + libro2.getTitulo() + " y que el libro " + libro1.getTitulo() + "; y el libro " + libro2.getTitulo()
                                + " tiene mas paginas que el libro " + libro1.getTitulo());
                    }
                }

            }
        }
    }
}
