
package constructorVehiculo1;


public class DirectorVehiculo {
    //clase Director(Consesionario)
    
    private ConstructorVehiculo constructor;
    
    public Vehiculo getVehiculo(){
        return constructor.getVehiculo();
    }
    public DirectorVehiculo(ConstructorVehiculo constructor){
        this.constructor = constructor;
        
    }
    
    public void construirVehiculo(){
        constructor.nuevoVehiculo();
        constructor.definirVehiculo();
        constructor.construirCarroceria();
        constructor.construirMotor();
        constructor.construirRuedas();
        constructor.definirExtras();
    }
}
