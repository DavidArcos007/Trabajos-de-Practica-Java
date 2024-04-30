package Recibo;

public class PlanDomestico implements IPlan {

    private double TerminoPot;
    private double TerminoEne;
    private double ImpElectricidad;
    private double iva;

    public PlanDomestico() {
        this.TerminoPot = 20.00;
        this.TerminoEne = 10.00;
        this.ImpElectricidad = 12.00;
        this.iva = 14.00;
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
        System.out.println("Valor a Pagar: " + valorPagar);
    }

    @Override
    public String toString() {
        return "DomesticPlan{" + "TerminoPotencia=" + TerminoPot
                + ", TerminoEnergia=" + TerminoEne + ", ImpuestoElectricidad="
                + ImpElectricidad + ", IVA=" + iva
                + ",ALQUILER DEL CONTADOR = " + IPlan.rate + '}';
    }

}
