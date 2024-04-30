
package constructorVehiculo1;


public interface IMotor {
  void setPotencia(int potencia);
    void setCilindraje(int cilindraje);
    String getDefinicion();
    String consumirCombustible();
    String inyectarCombustible(int cantidad);
}