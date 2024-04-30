
package constructorVehiculo1;


public class ConstructorVehiculoBMW extends ConstructorVehiculo {

  @Override
    public void definirVehiculo() {
        vehiculo.marca="BMW";
        vehiculo.modelo="BMW Serie 5";
    }

    @Override
    public void construirRuedas() {
        vehiculo.tipoRuedas = new Rueda();
        vehiculo.tipoRuedas.setDiametro(16);
        vehiculo.tipoRuedas.setLlanta("hierro");
        vehiculo.tipoRuedas.setNeumatico("Firestone");
    }

    @Override
    public void construirCarroceria() {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.setTipoCarroceria("monovolumen");
        vehiculo.tipoCarroceria.setHabitaculoReforzado(false);
        vehiculo.tipoCarroceria.setMaterial("Acero");
        vehiculo.color="Azul";
    }

    @Override
    public void construirMotor() {
        vehiculo.motor = new MotorGasolina();
        vehiculo.motor.setCilindraje(4300);
        vehiculo.motor.setPotencia(400);
    }

    @Override
    public void definirExtras() {
        vehiculo.bloqueoCentral=false;
        vehiculo.direccionAsistida=true;
    }
    
}
