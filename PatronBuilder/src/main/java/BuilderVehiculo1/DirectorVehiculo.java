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
public class DirectorVehiculo {
    //Clase director (Consecionario)
    
   private ConstructorVehiculo constructor;
   
   public DirectorVehiculo(ConstructorVehiculo constructor){
       this.constructor = constructor;
   }
   
   public void construirVhiculo(){
      constructor.nuevoVehiculo();
      constructor.definirVehiculo();
      constructor.construirCarroceria();
      constructor.construirMotor();
      constructor.construirRuedas();
      constructor.definirExtras();
   }
   
   public Vehiculo getVehiculo(){
        return constructor.getVehiculo();
    }
}
