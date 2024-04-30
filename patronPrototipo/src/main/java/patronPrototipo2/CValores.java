package patronPrototipo2;

public class CValores implements IPrototipo {

    private double sumatoria;
    private int m = 1;

    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public CValores() {

    }

    //Este es el constructor costoso 
    public CValores(int m) {
        this.m = m;
        int n;
        for (n = 0; n < 90; n++) {
            sumatoria += Math.sin(n * 0.0175);
        }
    }

    @Override
    public Object clonar() {
        CValores clon = new CValores(); 
        clon.setM(m);
        clon.setSumatoria(sumatoria); 
        
        return clon; 
    }

    @Override
    public String toString() {
        return String.format("Resultado :%f.4", (sumatoria *m ));
    }
    
    
}