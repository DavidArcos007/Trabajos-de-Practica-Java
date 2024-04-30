/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8reinasag_arcosaguas_ia;

import static java.lang.System.exit;
import java.util.Random;

/**
 *
 * @author David
 */
public class AlgoritmoGenerico {
    

    static int FILAS=6;
    static int COLUMNAS=4;
    static int NUMERO_GANADORES=3;
    
    static String[][] POBLACION=new String[FILAS][COLUMNAS];
    static String[][] POBLACION_TEMPORAL=new String[FILAS][COLUMNAS];
    static String[] PAREJAS=new String[FILAS];
    static String[] GANADORES=new String[NUMERO_GANADORES];
    static double SUMATORIA=0;
    
    Tablero TABLERO;
    
    public static void IncializarPoblacion(String [][] poblacion){
        System.out.println(" *** Se inicializa la población ***");
        String individuo;
        Random ri=new Random();
        for (int i = 0; i < PAREJAS.length; i++) {
           individuo="";
            for (int j = 0; j < 8; j++) {
                individuo+=ri.nextInt(8);
            }
            poblacion[i][0]=""+i;
            poblacion[i][1]=individuo;
        }
    }
    
    public static void calidad_individuo(String[][] poblacion,Tablero tablero){
        for (int i = 0; i < PAREJAS.length; i++) {
            String individuo=poblacion[i][1];
            tablero.iniciar_tablero();
            tablero.ubicarIndividuo(individuo, tablero);
            poblacion[i][2]=""+tablero.aptitud();
            SUMATORIA+=tablero.aptitud();
        }
    }
    
    public static void combinacion(String[][] poblacion,String[][] poblacion_temporal){
        System.out.println("*** Combinación ***");
        Random ri=new Random();
        int punto_cruce=0;
        String individuo1;
        String individuo2;
        String pareja_a="";
        
        for (int i = 0; i < PAREJAS.length/2; i++) {
            individuo1=poblacion[i][1];
            pareja_a=PAREJAS[i];
            String cadAd="";
            individuo2=poblacion[Integer.parseInt(pareja_a)][1];
            punto_cruce=ri.nextInt(8);
            System.out.println("Punto cruce: ["+punto_cruce+"]. Individuo ["+poblacion[i][0]+"]["+poblacion[i][1]+"] cruzado"
                    + " con individuo["+poblacion[Integer.parseInt(pareja_a)][0]+"]["+poblacion[Integer.parseInt(pareja_a)][1]+"]");
            
            for (int j = 0; j < punto_cruce; j++) {
                cadAd+=individuo1.charAt(i)+"";
            }
            
            for (int j = 0; j < individuo1.length(); j++) {
                cadAd+=individuo2.charAt(i)+"";
            }
            
            System.out.println("Nuevo Individuo: ["+cadAd+"]");
            poblacion_temporal[i][0]=""+i;
            poblacion_temporal[i][1]=cadAd;
        }
        for (int i = 0; i < PAREJAS.length; i++) {
            poblacion[i][0]=poblacion_temporal[i][0];
            poblacion[i][1]=poblacion_temporal[i][1];
        }
    }
    
    public static void Mutacion(String[][] poblacion,String[][] poblacion_temporal){
        Random ri=new Random();
        String individuo1;
        System.out.println("*** Mutación ***");
        for (int i = 0; i < 3; i++) {
            int mutado=ri.nextInt(FILAS);
            individuo1=poblacion[mutado][1].trim();
            int gen =ri.nextInt(8);
            String dato=""+individuo1.charAt(gen);
            individuo1=individuo1.replaceFirst(dato, ""+gen);
            poblacion[mutado][1]=individuo1;
            System.out.println("["+poblacion[mutado][0]+"]"+"["+poblacion[mutado][1]+"]");
        }
    }
    
    public static void Copiarse(String[][] poblacion,String[][] poblacion_temporal){
        System.out.println("\n *** Copiarse ***");
        int indice=0;
        int t=0;
        for (int i = 0; i < GANADORES.length; i++) {
            int ganador=Integer.parseInt(GANADORES[i]);
            poblacion_temporal[indice][0]=""+(i+t);
            poblacion_temporal[indice+1][0]=""+(i+1+t);
            for (int j = 0; j < COLUMNAS; j++) {
                if(poblacion[ganador][j].length()==8 && poblacion[ganador][j].contains(".")){
                    System.out.println("Cromosoma copiado: ["+poblacion[ganador][i]+"]");
                }
                poblacion_temporal[indice][j]=poblacion[ganador][j];
                poblacion_temporal[indice+1][j]=poblacion[ganador][j];
            }
            indice+=2;
            t++;
        }
        for (int i = 0; i < PAREJAS.length; i++) {
            poblacion[i][0]=poblacion_temporal[i][0];
            poblacion[i][1]=poblacion_temporal[i][1];
        }
    }
    
    public static void verGanadores(String[] ganadores){
        System.out.println("\n *** Ganadores de Torneo ***");
        int gano=0;
        for (int i = 0; i < ganadores.length; i++) {
            gano=Integer.parseInt(ganadores[i]);
            System.out.println("["+POBLACION[gano][0]+"]["+POBLACION[gano][1]+"]");
        }
    }
    
    public static void Torneo(String[][] poblacion){
        String A="";
        String ParejaA="";
        String B="";
        int indP=0;
        for (int i = 0; i < PAREJAS.length/2; i++) {
            A=poblacion[i][2];
            ParejaA=PAREJAS[i];
            B=poblacion[Integer.parseInt(ParejaA)][2];
            if(Double.parseDouble(A)<=Double.parseDouble(B)){
                GANADORES[indP]=poblacion[i][0];
            }else{
                GANADORES[indP]=ParejaA;
            }
            indP++;
        }
    }
    
    public static void adaptabilidad(String[][] poblacion,double suma){
        for (int i = 0; i < PAREJAS.length; i++) {
            poblacion[i][3]=""+Double.parseDouble(poblacion[i][2])/2;
        }
    }
    
    public static void Seleccion_Parejas(String[][] poblacion){
        System.out.println("\n *** Selección de parejas ***");
        String aux=poblacion[1][0];
        for (int i = 0; i < PAREJAS.length; i++) {
            PAREJAS[(PAREJAS.length-1)-i]=poblacion[i][0];
        }
    }
    
    public static void verPoblacion(String[][] poblacion,boolean pareja,Tablero tablero){
        System.out.println("\n *** Población Actual ***");
        String cadena="";
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < 4; j++) {
                cadena+="["+poblacion[i][j]+"]";
            }
            cadena+=""+"\n";
            tablero.iniciar_tablero();
            tablero.ubicarIndividuo(poblacion[i][1], tablero);
            if(tablero.aptitud()==0){
                System.out.println("\n *** INDIVIDUO ENCONTRADO ***\n["+poblacion[i][1]+"]");
                tablero.verTablero();
                exit(0);
            }else{
                System.out.println(poblacion[i][1]);
            }
            System.out.println(cadena);
        }
    }
    
    public static void main(String[] args) {
        Tablero tablero=new Tablero();
        IncializarPoblacion(POBLACION);
        int generacion=1;
        int numeroAleatorio=(int)(Math.random()*100);
        int numeroAleatorio2=(int)(Math.random()*100);
        while(generacion<=10000){
            System.out.println("\n\n\n\n\n ***GENERACION "+generacion+" ***");
            calidad_individuo(POBLACION, tablero);
            adaptabilidad(POBLACION, SUMATORIA);
            verPoblacion(POBLACION, true, tablero);
            calidad_individuo(POBLACION, tablero);
            adaptabilidad(POBLACION, SUMATORIA);
            Seleccion_Parejas(POBLACION);
            Torneo(POBLACION);
            verGanadores(GANADORES);
            Copiarse(POBLACION, POBLACION_TEMPORAL);
            calidad_individuo(POBLACION, tablero);
            adaptabilidad(POBLACION, SUMATORIA);
            verPoblacion(POBLACION_TEMPORAL, true, tablero);
            Seleccion_Parejas(POBLACION);
            if(50<=numeroAleatorio && numeroAleatorio<=90){
                System.out.println("\nPoblacion de Cruza:" +numeroAleatorio);
                combinacion(POBLACION, POBLACION_TEMPORAL);
                calidad_individuo(POBLACION, tablero);
                adaptabilidad(POBLACION, SUMATORIA);
                verPoblacion(POBLACION, true, tablero);
            }else{
                System.out.println("\n La probabilidad de cruza ["+numeroAleatorio+"] no está entre los valores");
            }
            
            if(0<=numeroAleatorio2 && numeroAleatorio2<=75){
                System.out.println("Probabilidad de mutación: "+numeroAleatorio2);
                Mutacion(POBLACION, POBLACION_TEMPORAL);
                calidad_individuo(POBLACION, tablero);
                adaptabilidad(POBLACION, SUMATORIA);
                verPoblacion(POBLACION, true, tablero);
            }else{
                System.out.println("La probabilidad de mutación ["+numeroAleatorio2+"]");
            }
            generacion++;
        }
        System.out.println("No se encontró la solución en las primeras "+(generacion-1)+" generaciones");
    }
}
