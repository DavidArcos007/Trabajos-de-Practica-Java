
package Recibo;

public class Factura implements IPlan{

    @Override
    public void getRide() {
        System.out.println("No se ha consumido ");
    }

    @Override
    
    public void calcularBIll(int units) {
    units= (int) IPlan.rate;
    
        System.out.println(units);
    }
    
}