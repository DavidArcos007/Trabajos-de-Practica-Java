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
public class ConstructorVehiculoAudi extends ConstructorVehiculo{

    @Override
    public void definirVehiculo() {
        vehiculo.marca="Audi";
        vehiculo.modelo="A3 sportback";
    }

    @Override
    public void construirRuedas() {
        vehiculo.tipoRueda = new Rueda();
        vehiculo.tipoRueda.setDiametro(17);
        vehiculo.tipoRueda.setLlanta("Aluminio");
        vehiculo.tipoRueda.setNeumatico("Michelin");
    }

    @Override
    public void construirCarroceria() {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.setTipoCarroceria("Deportivo");
        vehiculo.tipoCarroceria.setAvitaculoReforzado(true);
        vehiculo.tipoCarroceria.setMaterial("Fibra de Carbono");
        vehiculo.color = "Plata cromado";
    }

    @Override
    public void construirMotor() {
        vehiculo.tipoMotor = new MotorDiesel();
         vehiculo.tipoMotor.setCilindraje(2400);
          vehiculo.tipoMotor.setPotencia(300);
    }

    @Override
    public void definirExtras() {
       vehiculo.bloqueoCentral = true;
       vehiculo.direccionAsistida = true;
    }
    
}
