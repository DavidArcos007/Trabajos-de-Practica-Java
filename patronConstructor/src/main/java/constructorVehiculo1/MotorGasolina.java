
package constructorVehiculo1;


public class MotorGasolina implements IMotor{
    int cilindraje, potencia;
    @Override
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String getDefinicion() {
       return "Potencia: " + this.potencia
       + "\nCilindraje: " + this.cilindraje;
    }

    @Override
    public String consumirCombustible() {
        return "Motor Gasolina: Realizada combustión de Gasolina";
    }

    @Override
    public String inyectarCombustible(int cantidad) {
        return String.format("Motor Gasolina: Inyectados %d ml, de Gasolina", cantidad);
    }

}
