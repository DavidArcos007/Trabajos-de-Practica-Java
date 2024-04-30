
package constructorVehiculo1;


public class ConstructorVehiculoAudi extends ConstructorVehiculo{

    @Override
    public void definirVehiculo() {
        vehiculo.marca="Audi";
        vehiculo.modelo="A3 sportback";
    }

    @Override
    public void construirRuedas() {
        vehiculo.tipoRuedas = new Rueda();
        vehiculo.tipoRuedas.setDiametro(17);
        vehiculo.tipoRuedas.setLlanta("aluminio");
        vehiculo.tipoRuedas.setNeumatico("Michelin");
    }

    @Override
    public void construirCarroceria() {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.setTipoCarroceria("Deportivo");
        vehiculo.tipoCarroceria.setHabitaculoReforzado(true);
        vehiculo.tipoCarroceria.setMaterial("Fibra de Carbono");
        vehiculo.color="Plata Cromado";
    }

    @Override
    public void construirMotor() {
        vehiculo.motor = new MotorDisel();
        vehiculo.motor.setCilindraje(2400);
        vehiculo.motor.setPotencia(300);
    }

    @Override
    public void definirExtras() {
        vehiculo.bloqueoCentral=true;
        vehiculo.direccionAsistida=true;
    }
    
}
