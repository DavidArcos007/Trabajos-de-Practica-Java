
package patronPrototipo2;


public class CAuto implements IPrototipo{

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    private String modelo; 
    private int costo; 
    
    public CAuto(String modelo, int costo){
        this.modelo = modelo; 
        this.costo = costo; 
    }

    @Override
    public String toString() {
        return String.format("%s%s%d","Auto: ", modelo, costo); 
    }

    @Override
    public Object clonar() {
        CAuto clon = new CAuto(modelo,costo);
        return clon; 
    }
    
}