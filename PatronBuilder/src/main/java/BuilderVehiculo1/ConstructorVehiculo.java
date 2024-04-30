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
public abstract class ConstructorVehiculo {

    protected Vehiculo vehiculo;

    public void nuevoVehiculo() {
        vehiculo = new Vehiculo();
    }

    //declarar metodos que recuperan el objeto 
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    //region metodos abstractos
    public abstract void definirVehiculo();

    public abstract void construirRuedas();

    public abstract void construirCarroceria();

    public abstract void construirMotor();

    public abstract void definirExtras();
    //end region 
}
