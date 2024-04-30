
package patronPrototipo2;


public class CPersona implements IPrototipo {
private String nombre;
private int edad;

public CPersona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object clonar() {
       CPersona clon = new CPersona(nombre, edad);
       return clon;
    }
    
    @Override
    public String toString() {
        return String.format("%s%s%d","Persona: ", nombre, edad);
    }
}
