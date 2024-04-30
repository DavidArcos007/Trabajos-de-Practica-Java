
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class dibujoFiguras {
    public static void HacerLinea(Graphics g, int x, int y, int x1, int y1) 
    {
       g.drawLine(x, y, x1, y1);    
    }
    public static void HacerCirculo(Graphics g, int x, int y, int x1, int y1) 
    {
        
       g.drawOval(x, y, y1, y1);
       g.setColor(Color.red);
       g.fillOval(x, y, y1, y1);
    }
     public static void  HacerPoligono(Graphics g) 
    {
        int[] a = {100, 150, 170, 190, 200};
        int[] b = {120, 280, 200, 250, 60};
        g.drawPolygon(a, b, 5);
        g.setColor(Color.green);
        g.fillPolygon(a, b, 5);
        
    }
    public static void HacerCuadrado(Graphics g, int x, int y, int x1, int y1) 
    {
    g.drawRect(x, y, y1, y1);
    g.setColor(Color.ORANGE);
    g.fillRect(x, y, y1, y1);
    }
     public static void HacerTriangulo(Graphics g) 
    {
        int[] a = {35, 10, 60};
        int[] b = {150, 200, 200};
        g.drawPolygon(a, b, 3);
        g.setColor(Color.blue);
        g.fillPolygon(a, b, 3);
   }
     public static void HacerArco(Graphics g, int x, int y, int x1, int x2, int y1,int y2 ){
         g.drawArc(x, y, x1, x2, y1, y2);
         g.setColor(Color.LIGHT_GRAY);
         g.fillArc(x, y, x1, x2, y1, y2);
     }
}
