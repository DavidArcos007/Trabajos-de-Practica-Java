package Recibo;

public class PlanInstitucional implements IPlan {

    private double TerminoPot;
    private double TerminoEne;
    private double ImpElectricidad;
    private double iva;

    public PlanInstitucional() {
        this.TerminoPot = 40.00;
        this.TerminoEne = 30.00;
        this.ImpElectricidad = 35.00;
        this.iva = 36.00;
    }

    @Override
    public void getRide() {
        System.out.println("Se Calculo la factura de su Red Domestica ");
    }

    @Override
    public void calcularBIll(int units) {
        double valorPagar;
        valorPagar = units * (this.TerminoPot + this.TerminoEne 
                + this.ImpElectricidad + this.iva + IPlan.rate);
        System.out.println("Valor a Pagar : " + valorPagar);
    }

    @Override
    public String toString() {
        return "Plan Domestico{" + "Termino Potencia=" + TerminoPot
                + ", TerminoEnergia=" + TerminoEne + ", ImpuestoElectricidad=" 
                + ImpElectricidad + ", IVA=" + iva
                + ",ALQUILER DEL CONTADOR = " + IPlan.rate + '}';
    }

}
