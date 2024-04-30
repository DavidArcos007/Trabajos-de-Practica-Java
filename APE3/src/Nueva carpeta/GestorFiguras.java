/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_004;

import Deber_003.*;

/**
 *
 * @author DELL 2019
 */
public class GestorFiguras {

    final int CANT_FIGS = 5;
    int i;

    ListaCua cua;
    ListaCir cir;
    ListaRec rec;

    GestorFiguras() {

        cua = new ListaCua();
        cir = new ListaCir();
        rec = new ListaRec();
    }

    //Cuadrado
    public void ingresoCua(double lado) {
        if (i < CANT_FIGS) {
            cua.insertar(new Cuadrado(lado));
            System.out.print("Se Ha Ingresado ", (i + 1), " Cuadrado");
            i++;
        } else {
            System.out.print("Se Ha Alcanzado El Límite Máximo De Figuras");
        }

    }

    public void areaCua(int num) {
        i = 0;

        do {
            if (i == (num - 1)) {
           
                System.out.print("El Área Del Cuadrado " + num + " Es: ");
                cua.visualizarÁrea();
                System.out.println(" ");
            }
            i++;
        } while (i <= num);

    }

    public void perimCua(int num) {
        i = 0;

        do {
            if (i == (num - 1)) {
                
                System.out.print("El Perímetro Del Cuadrado " + num + " Es: ");
                cua.visualizarPerim();
                System.out.println(" ");
            }
            i++;
        } while (i <= num);

    }

    //Círculo 
    public void ingresoCir(double radio) {
        if (i < CANT_FIGS) {
            cir.insertar(new Circulo(radio));
            System.out.print("Se Ha Ingresado ", (i + 1), " Círculo");
            i++;
        } else {
            System.out.print("Se Ha Alcanzado El Límite Máximo De Figuras");
        }

    }

    public void areaCir(int num) {
        i = 0;

        do {

            if (i == (num - 1)) {
             
                System.out.print("El Área Del Círculo " + num + " Es: ");
                cir.visualizarÁrea();
                System.out.println(" ");
            }
            i++;
        } while (i <= num);

    }

    public void perimCir(int num) {
        i = 0;

        do {
            if (i == (num - 1)) {
           
                System.out.print("El Perímetro Del Círculo " + num + " Es: ");
                cir.visualizarPerim();
            }
            i++;
        } while (i <= num);

    }

    //Rectángulo
    public void ingresoRec(double ancho, double alto) {
        if (i < CANT_FIGS) {
            rec.insertar(new Rectangulo(ancho, alto));
            System.out.print( "Se Ha Ingresado ", (i + 1), " Rectángulo");
            i++;
        } else {
            System.out.print("Se Ha Alcanzado El Límite Máximo De Figuras");
        }

    }

    public void areaRec(int num) {
        i = 0;

        do {
            if (i == (num - 1)) {
               
                System.out.print("El Área Del Rectángulo " + num + " Es: ");
                rec.visualizarÁrea();
                System.out.println(" ");
            }
            i++;
        } while (i <= num);

    }

    public void perimRec(int num) {
        i = 0;

        do {
            if (i == (num - 1)) {
             
                System.out.print("El Perímetro Del Rectángulo " + num + " Es: ");
                rec.visualizarÁrea();
                System.out.println(" ");
            }
            i++;
        } while (i <= num);

    }

}
