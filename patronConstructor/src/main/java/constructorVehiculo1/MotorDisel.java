
package constructorVehiculo1;


public class MotorDisel implements IMotor{
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
        return "Motor Diesel: Realizada combustión de Gasoil";
    }

    @Override
    public String inyectarCombustible(int cantidad) {
        return String.format("Motor Diesel: Inyectados %d ml, de Gasoil", cantidad);
    }

}