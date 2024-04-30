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
public class DemoConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DirectorVehiculo directorAudi = new DirectorVehiculo(new ConstructorVehiculoAudi());
        
        //director indica la construccion del vehiculo
        directorAudi.construirVhiculo();
        
        Vehiculo audiA3 = directorAudi.getVehiculo();
        
         System.out.println("PRIMER VEHÍCULO:" + System.lineSeparator() );
        System.out.println(audiA3.mostrarVehiculo());
    }
    
}
