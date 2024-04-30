/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_004;

import Deber_003.*;
import java.util.Scanner;

/**
 *
 * @author DELL 2019
 */
public class Menu {

    public static void menu(String[] args) {

        Scanner teclado = new Scanner(System.in);

        GestorFiguras g = new GestorFiguras();

        int opción;

        char preg = 0;

        do {
       

            do {
                System.out.printf("%20s%s\n"
                        + "%20s%s\n"
                        + "%20s%s\n"
                        + "%20s%s\n",
                        "", "1.- Ingresar Datos De Figura Geométrica",
                        "", "2.- Calcular El Área De Una Figura Geométrica.",
                        "", "3.- Calcular El Perímetro De Una Figura Geométrica",
                        "", "4.- Salir\n");
                System.out.printf("%30s", "Opción (1 - 4) ==> ");
                opción = Integer.valueOf(teclado.next());

                if (opción < 1 || opción > 4) {
                    System.out.printf("%-37s\n", "*** Desde 1 hasta 4 ***\n");
                }
            } while (opción < 1 || opción > 4); // Ingresar la opción 

            switch (opción) {
                case 1:
                    ingresoFig(g);
                    break;

                case 2:
                    calcArea(g);
                    break;
                case 3:
                    calcPerim(g);
                    break;

                case 4:
                    System.out.println("GRACIAS ");
                    break;
            }

        } while (opción != 4);

    }

    //Ingreso de Datos Figuras
    public static void ingresoFig(GestorFiguras g) {
        Scanner teclado = new Scanner(System.in);

        int opción;
        char preg = 0;
        do {

           

            do {
                System.out.printf("%20s%s\n"
                        + "%20s%s\n"
                        + "%20s%s\n",
                        "", "1.- Ingresar Datos De Cuadrado",
                        "", "2.- Ingresar Datos De Círculo",
                        "", "3.- Ingresar Datos De Rectángulo\n");
                System.out.printf("%30s", "Opción (1 - 3) ==> ");
                opción = Integer.valueOf(teclado.next());

                if (opción < 1 || opción > 3) {
                    System.out.printf("%-37s\n", " *** Desde 1 hasta 3 ***\n");
                }
            } while (opción < 1 || opción > 3); // Ingresar la opción // 

            switch (opción) {
                case 1:
                    System.out.print("Lado Del Cuadrado: ");
                    g.ingresoCua(teclado.nextDouble());
                    break;

                case 2:
                    System.out.print("Radio Del Círculo: ");
                    g.ingresoCir(teclado.nextDouble());
                    break;

                case 3:
                    System.out.print(" El Largo Y Ancho Del Rectángulo: ");
                    g.ingresoRec(teclado.nextDouble(), teclado.nextDouble());
                    break;
            }
            System.out.println(" ");
            System.out.print("¿Desea Ingresar Otra Figura? (S / N) = ");
            System.out.print(" ");
            preg = teclado.next().toUpperCase().charAt(0);

        } while (preg == 'S');
    }

    //Cálculo de Áreas
    public static void calcArea(GestorFiguras g) {
        
        Scanner teclado = new Scanner(System.in);

        int opción;
        char preg = 0;
        do {

            

            do {
                System.out.printf("%20s%s\n"
                        + "%20s%s\n"
                        + "%20s%s\n",
                        "", "1.- Calcular Área De Cuadrado",
                        "", "2.- Calcular Área De Círculo",
                        "", "3.- Calcular Área De Rectángulo\n");
                System.out.printf("%30s", "Opción (1 - 3) ==> ");
                opción = Integer.valueOf(teclado.next());

                if (opción < 1 || opción > 3) {
                    System.out.printf("%-37s\n", " *** Desde 1 hasta 3 ***\n");
                }
            } while (opción < 1 || opción > 3); // Ingresar la opción // 

            switch (opción) {
                case 1:
                    System.out.print("El Área del Cuadrado N. : ");
                    g.areaCua(teclado.nextInt());
                    break;

                case 2:
                     System.out.print("El Área del Círculo N. : ");
                    g.areaCir(teclado.nextInt());
                    break;

                case 3:
                     System.out.print(" El Área del Rectángulo N. : ");
                    g.areaRec(teclado.nextInt());
                    break;
            }
            System.out.println(" ");
            System.out.print("¿Desea  Otra Figura? (S / N) = ");
            System.out.print(" ");
            preg = teclado.next().toUpperCase().charAt(0);

        } while (preg == 'S');

    }
    
    //Cálculo de Perímetros
    public static void calcPerim(GestorFiguras g) {
        
        Scanner teclado = new Scanner(System.in);

        int opción;
        char preg = 0;
        do {


            do {
                System.out.printf("%20s%s\n"
                        + "%20s%s\n"
                        + "%20s%s\n",
                        "", "1.- Calcular Perímetro De Cuadrado",
                        "", "2.- Calcular Perímetro De Círculo",
                        "", "3.- Calcular Perímetro De Rectángulo\n");
                System.out.printf("%30s", "Opción (1 - 3) ==> ");
                opción = Integer.valueOf(teclado.next());

                if (opción < 1 || opción > 3) {
                    System.out.printf("%-37s\n", "*** Desde 1 hasta 3 ***\n");
                }
            } while (opción < 1 || opción > 3); // Ingresar la opción // 

            switch (opción) {
                case 1:
                    System.out.print("El Perímetro del Cuadrado N. : ");
                    g.perimCua(teclado.nextInt());
                    break;

                case 2:
                     System.out.print("El Perímetro  del Círculo N. : ");
                    g.perimCir(teclado.nextInt());
                    break;

                case 3:
                     System.out.print("El Perímetro del Rectángulo N. : ");
                    g.perimRec(teclado.nextInt());
                    break;
            }
            System.out.println(" ");
            System.out.print("¿Desea Calcular Otra Figura? (S/ N) = ");
            System.out.print(" ");
            preg = teclado.next().toUpperCase().charAt(0);

        } while (preg == 'S');

    }
}
