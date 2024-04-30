
package Recibo;


public class PlanComercial implements IPlan {

        private double TerminoPot;
private double TerminoEne;
private double  ImpElectricidad;
private double  iva;

    public PlanComercial() {
     this.TerminoPot = 30.00;
        this.TerminoEne = 20.00;
        this.ImpElectricidad = 21.00;
        this.iva = 25.00;
    }

    @Override
    public void getRide() {
        System.out.println("Se Calculo la factura de su Red Comercial");
    }

    @Override
    public void calcularBIll(int units) {
         double valorPagar;
        valorPagar= units * (this.TerminoPot + this.TerminoEne
                +this.ImpElectricidad+this.iva + IPlan.rate);
        System.out.println("Valor a Pagar : "+ valorPagar);
    }

    @Override
    public String toString() {
        return "PlanDomestico{" + "TerminoPotencia=" + TerminoPot 
                + ", TerminoEnergia=" + TerminoEne + ", ImpuestoElectricidad=" 
                + ImpElectricidad + ", IVA=" + iva +
                ",ALQUILER DEL CONTADOR = "+IPlan.rate+ '}';
    }
    
    
}
