/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotarea;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {
    public static void main(String[] args) {
        Avion misAviones[] = new Avion[4];
        
        misAviones[0] = new Avion("20 T ", "  AmericanAirline   ", " 14/05/2005");
        misAviones[1] = new AvionComercial(350,"45 T ", "  Singapore Airlines   ", " 23/06/2015");
        misAviones[2] = new AvionMilitar("Misiles",1350,"30 T ", "  Qatar Airways  ", " 09/08/2017");
        misAviones[3] = new AvionCarga("250 T","60 T ", "  Tame   ", " 29/03/2004");
        
        for(Avion aviones: misAviones){
            System.out.println(aviones.mostrarDatos());
            System.out.println(" ");
        }
         Avion.autor();
    }
   
}
