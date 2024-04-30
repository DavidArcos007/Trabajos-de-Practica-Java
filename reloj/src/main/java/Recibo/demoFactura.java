package Recibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class demoFactura {

    public static void main(String[] args) {
        String factura;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        GetPlanFactory fabrica = new GetPlanFactory();

        try {
            System.out.println("Ingrese la red que usa:");
            factura = br.readLine();
            IPlan cx1 = fabrica.getPlan(factura);
            cx1.getRide();
            cx1.calcularBIll(1);
            System.out.println(cx1);
        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
