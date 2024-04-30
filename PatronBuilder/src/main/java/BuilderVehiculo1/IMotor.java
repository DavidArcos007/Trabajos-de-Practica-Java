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
public interface IMotor {

    void setPotencia(int potencia);

    void setCilindraje(int cilindraje);

    String getDefinicionMotor();

    String consumirCombustible();

    String inyectarCombustible(int cantidad);

}
