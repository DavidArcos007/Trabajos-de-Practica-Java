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
public class AvionCarga extends Avion {
private String Capacidad;
    public AvionCarga(String Capacidad, String peso, String aerolinea, String fecha) {
        super(peso, aerolinea, fecha);
        this.Capacidad = Capacidad;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }
    
 
    @Override
    public String mostrarDatos(){
        System.out.println("----- AVION DE CARGA -----");
      return "\nPeso:    " + peso+"\nAerolinea:    "+aerolinea
              +"\nFecha de Elaboracion:   "+fecha+"\nCapacidad(T):     "+Capacidad+"T";
    }
}
