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
public class ConstructorVehiculoBMW extends ConstructorVehiculo{

    @Override
    public void definirVehiculo() {
        vehiculo.marca="BMW";
        vehiculo.modelo="Serie 5";
    }

    @Override
    public void construirRuedas() {
        vehiculo.tipoRueda = new Rueda();
        vehiculo.tipoRueda.setDiametro(16);
        vehiculo.tipoRueda.setLlanta("Hierro");
        vehiculo.tipoRueda.setNeumatico("Bridgestone");
    }

    @Override
    public void construirCarroceria() {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.setTipoCarroceria("Monovolumen");
        vehiculo.tipoCarroceria.setAvitaculoReforzado(false);
        vehiculo.tipoCarroceria.setMaterial("Acero");
        vehiculo.color = "Negro";
    }

    @Override
    public void construirMotor() {
        vehiculo.tipoMotor = new MotorGasolina();
         vehiculo.tipoMotor.setCilindraje(4400);
          vehiculo.tipoMotor.setPotencia(500);
    }

    @Override
    public void definirExtras() {
       vehiculo.bloqueoCentral = false;
       vehiculo.direccionAsistida = true;
    }
    
}
