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
public class Avion {

    protected String peso;
    protected String aerolinea;
    protected String fecha;

    public Avion(String peso, String aerolinea, String fecha) {
        this.peso = peso;
        this.aerolinea = aerolinea;
        this.fecha = fecha;
        
    }

    public String getPeso() {
        return peso;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getFecha() {
        return fecha;
    }

    public String mostrarDatos() {
        System.out.printf("%105s\n","----- Lista de Aviones usando Polimorfismo -----");
        

        return "\nPeso:   " + peso + "\nAerolinea:  " + aerolinea
                + "\nFecha de Elaboracion:    " + fecha;
    }
    
     public static void autor() {
        System.out.println("****************************");
        System.out.println("DAVID ARCOS - WILDER VINUEZA");
        System.out.println("****************************");
    }

}
