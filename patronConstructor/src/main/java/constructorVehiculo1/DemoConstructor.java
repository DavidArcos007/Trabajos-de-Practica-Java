
package constructorVehiculo1;


public class DemoConstructor {

   
    public static void main(String[] args) {
     //Definir al director
        DirectorVehiculo directorAudi = new DirectorVehiculo(new ConstructorVehiculoAudi());
        //director indica la construccion
        directorAudi.construirVehiculo();
        
        Vehiculo audiA3 = directorAudi.getVehiculo();
        
        // Mostramos por pantalla los dos vehiculos:
        System.out.println("PRIMER VEHÍCULO:" + System.lineSeparator() );
        System.out.println(audiA3.mostrarVehiculo());
        
        // Repetimos el proceso con un constructor distinto.
        DirectorVehiculo directorBMW = new DirectorVehiculo( new ConstructorVehiculoBMW());
        directorBMW.construirVehiculo();
        Vehiculo bmw = directorBMW.getVehiculo();
        
        System.out.println("===============================================================");
        
        System.out.println("SEGUNDO VEHÍCULO:" + System.lineSeparator() );
        System.out.println(bmw.mostrarVehiculo());
    }
}

