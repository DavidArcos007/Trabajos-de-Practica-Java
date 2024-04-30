/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8reinasag_arcosaguas_ia;

/**
 *
 * @author David
 */
public class Tablero {
    
static int FILAS = 8;
    static int COLUMNAS = 8;
    static String[][] TABLERO;

    public Tablero() {
        TABLERO = new String[FILAS][COLUMNAS];
    }

    public void colocar_reina(int fila, int columna) {
        TABLERO[fila][columna] = "1";
    }

    public void iniciar_tablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                TABLERO[i][j] = "0";
            }
        }
    }

    //revision horizontal
    public int cruceHorizontal() {
        int total = 0;
        for (int i = 0; i < FILAS; i++) {
            total += buscarCruceHorizontal(i);
        }
        return total;
    }

    public int buscarCruceHorizontal(int fila) {
        int contador = 0;
        for (int i = 0; i < COLUMNAS; i++) {
            if (TABLERO[fila][i].equals("1")) {
                contador++;
            }
        }

        return contador <= 1 ? 0 : contador;
    }

    //revision vertical
    public int cruceVertical() {
        int total = 0;
        for (int i = 0; i < COLUMNAS; i++) {
            total += buscarCruceVertical(i);
        }
        return total;
    }

    public int buscarCruceVertical(int columna) {
        int contador = 0;
        for (int i = 0; i < FILAS; i++) {
            if (TABLERO[i][columna].equals("1")) {
                contador++;
            }
        }
        return contador <= 1 ? 0 : contador;
    }

    //revision diagonal derecha
    public int cruceDigonalDerecha() {
        int total = 0, f = 0, n;
        for (int i = 0; i < COLUMNAS; i++) {
            n = buscarCruceDiagonalDerecha(f,i);
            total += n;
        }
        for (int i = 1; i < FILAS; i++) {
            total += buscarCruceDiagonalDerecha(i, 0);
        }
        return total;
    }

    public int buscarCruceDiagonalDerecha(int fila, int columna) {
        int f = fila, contador = 0;
        for (int i = columna; i < COLUMNAS; i++) {
            if (f < FILAS) {
                if (TABLERO[f][i].equals("1")) {
                    contador++;
                }
                f++;
            }
        }
        return contador <= 1 ? 0 : contador;
    }

    public int buscarCruceDiagonalIzquierda1(int fila,int columna){
        int f=fila,contador=0;
        for (int i = columna; i >= 0; i--) {
            if(f<FILAS){
                if(TABLERO[f*-1][i].equals("1")){
                    contador++;
                }
                f--;
            }
        }
        
        return contador<=1 ? 0:contador;
    }
    
    public int buscarCruceDiagonalIzquierda2(int fila,int columna){
        int f=fila,contador=0;
        for (int i = columna; i > 0; i--) {
            if(f<FILAS){
                if(TABLERO[f][i].equals("1")){
                    contador++;
                }
                f++;
            }
        }
        return contador<=1 ? 0:contador;
    }
    
    public int cruceDiagonalIzquierda(){
        int total=0;
        for (int i = 0; i < COLUMNAS; i++) {
            total+=buscarCruceDiagonalIzquierda1(0, i);
        }
        for (int i = 1; i < FILAS; i++) {
            total+=buscarCruceDiagonalIzquierda2(i,7);
        }
        return total;
    }
    
    public void ubicarIndividuo(String individuo,Tablero tablero){
        String pos;
        for (int i = 0; i < individuo.length(); i++) {
            pos=""+individuo.charAt(i);
            tablero.colocar_reina(Integer.parseInt(pos), i);
        }
    }
    
    public void verTablero(){
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println(" "+TABLERO[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public int aptitud(){
        return cruceDiagonalIzquierda()+cruceDigonalDerecha()+cruceHorizontal()+cruceVertical();
    }
    
}
