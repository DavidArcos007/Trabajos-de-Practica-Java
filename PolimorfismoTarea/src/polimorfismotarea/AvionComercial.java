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
public class AvionComercial extends Avion{
private int nPasajeros;
    public AvionComercial(int nPasajeros, String peso, String aerolinea, String fecha) {
        super(peso, aerolinea, fecha);
        this.nPasajeros = nPasajeros;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
       this.nPasajeros = nPasajeros;
    }
    @Override
  public String mostrarDatos(){
      System.out.println("----- AVION COMERCIAL -----");
      return "Peso:     " + peso+"\nAerolinea:    "+aerolinea
              +"\nFecha de Elaboracion :   "+fecha+"\nPasajeros:    "+nPasajeros;
  }

}