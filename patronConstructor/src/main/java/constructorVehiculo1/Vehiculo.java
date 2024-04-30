
package constructorVehiculo1;


public class Vehiculo {
     String color;
    String marca;
    String modelo;
    boolean bloqueoCentral;
    boolean direccionAsistida;
    Carroceria tipoCarroceria;
    Rueda tipoRuedas;
    IMotor motor;

    public String mostrarVehiculo(){

        StringBuilder sb = new StringBuilder();
        String nl = System.getProperty("line.separator");

        sb.append("El presente vehiculo es un ").append(marca).append(" ").append(modelo);
        sb.append(" estilo ").append(tipoCarroceria.getTipoCarroceria()).append(nl);
        sb.append("Color: ").append(color).append(nl);
        sb.append(direccionAsistida ? "Con " : "Sin ").append("direccion asistida").append(nl);
        sb.append(bloqueoCentral ? "Con " : "Sin ").append("bloqueo centralizado").append(nl);
        sb.append("carroceria de ").append(tipoCarroceria.getMaterial());
        sb.append(tipoCarroceria.getHabitaculoReforzado() ? " con " : " sin ").append("el habitaculo reforzado").append(nl);
        sb.append("Ruedas con llantas ").append(tipoRuedas.getLlanta()).append(" de ").append(tipoRuedas.getDiametro()).append(" cm").append(nl);
        sb.append("Neumaticos ").append(tipoRuedas.getNeumatico()).append(nl);
        sb.append("Motor: ").append(motor.getDefinicion()).append(nl);

        return sb.toString();
    }
}
