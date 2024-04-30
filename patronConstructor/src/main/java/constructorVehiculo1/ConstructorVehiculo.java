
package constructorVehiculo1;


public abstract class ConstructorVehiculo {
    protected Vehiculo vehiculo;
    
    public void nuevoVehiculo(){
        vehiculo  = new Vehiculo();
    }
    //Declarar metodos que recuperan el objeto 
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    //region metodos abstractos
    public abstract void definirVehiculo();
    public abstract void construirRuedas(); 
    public abstract void construirCarroceria();
    public abstract void construirMotor();
    public abstract void definirExtras();
    
}
