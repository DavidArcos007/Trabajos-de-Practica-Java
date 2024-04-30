package Recibo;

public class GetPlanFactory {

    public IPlan getPlan(String factura) {
        if (factura == null) {
            return new Factura();
        }
        if (factura.equalsIgnoreCase("PLAN DOMESTICO")) {

            return new PlanDomestico();

        } else if (factura.equalsIgnoreCase("PLAN COMERCIAL")) {

            return new PlanComercial();

        } else if (factura.equalsIgnoreCase("PLAN INSTITUCION")) {

            return new PlanInstitucional();

        } else {
            return new Factura();
        }
        
    }
    
}
