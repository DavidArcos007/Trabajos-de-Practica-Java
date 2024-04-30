/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderVehiculo1;

/**
 *
 * @author marce
 */
public class Vehiculo {
    String color;
    String marca;
    String modelo;
    boolean bloqueoCentral;
    boolean direccionAsistida;
    
    Carroceria tipoCarroceria;
    Rueda tipoRueda;
    IMotor tipoMotor;
    
    public String mostrarVehiculo(){
        
        StringBuilder sb = new StringBuilder();
        String nl = System.getProperty("line.separator");
 
        sb.append("El presente vehiculo es un ").append(marca).append(" ").append(modelo);
        sb.append(" estilo ").append(tipoCarroceria.getTipoCarroceria()).append(nl);
        sb.append("Color: ").append(color).append(nl);
        sb.append(direccionAsistida ? "Con " : "Sin ").append("direccion asistida").append(nl);
        sb.append(bloqueoCentral ? "Con " : "Sin ").append("bloqueo centralizado").append(nl);
        sb.append("carroceria de ").append(tipoCarroceria.getMaterial());
        sb.append(tipoCarroceria.getAvitaculoReforzado() ? " con " : " sin ").append("el habitaculo reforzado").append(nl);
        sb.append("Ruedas con llantas ").append(tipoRueda.getLlanta()).append(" de ").append(tipoRueda.getDiametro()).append(" cm").append(nl);
        sb.append("Neumaticos ").append(tipoRueda.getNeumatico()).append(nl);
        sb.append("Motor: ").append(tipoMotor.getDefinicionMotor()).append(nl);

        return sb.toString();
    }
    
}
