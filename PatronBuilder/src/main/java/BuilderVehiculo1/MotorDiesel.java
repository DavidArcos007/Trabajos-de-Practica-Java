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
public class MotorDiesel implements IMotor {

    int cilindraje;
    int potencia;

    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void setCilindraje(int cilindraje) {
        this.cilindraje=cilindraje;
    }

    @Override
    public String getDefinicionMotor() {
        return "Cilindraje: "+this.cilindraje+" ------ potencia: "+this.potencia; 
    }

    @Override
    public String consumirCombustible() {
        return "Motor Diesel: Realizada combustion del gasoil";
    }

    @Override
    public String inyectarCombustible(int cantidad) {
        return String.format("Motor Diesel: Inyectado %d ml de gasoil", cantidad);
    }

}
