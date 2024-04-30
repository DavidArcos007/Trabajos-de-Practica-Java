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
public class AvionMilitar extends Avion{
    private String armamento;
    private int velocidad;
    public AvionMilitar(String armamento,int velocidad, String peso, String aerolinea, String fecha) {
        super(peso, aerolinea, fecha);
        this.armamento = armamento;
        this.velocidad = velocidad;
    }

    public String getArmamento() {
        return armamento;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
 
    @Override
    public String mostrarDatos(){
        System.out.println("----- AVION MILITAR -----");
      return "Peso:    " + peso+"\nAerolinea:    "+aerolinea
              +"\nFecha de Elaboracion:   "+fecha+"\nTipo de Armamento:     "+armamento 
              +"\nVelocidad Maxima(km/h):     "+velocidad;
    }
}
