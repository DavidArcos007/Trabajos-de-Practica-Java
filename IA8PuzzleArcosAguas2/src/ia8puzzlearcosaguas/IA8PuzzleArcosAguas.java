package ia8puzzlearcosaguas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal donde se ejecuta el programa de Solución al 8 puzzle con A*
 * @author David y Christian
 */
public class IA8PuzzleArcosAguas {

    public static void main(String[] args) {
  
        int[][] matriz = generar_matriz();
        
        if (tieneSolucion(matriz)) {

            Nodo raiz = new Nodo(new Estado(matriz), null, true);
            AEstrella estrella = new AEstrella();

            Nodo hojaSolucion = estrella.crear_arbol(raiz);

            List<Nodo> caminoSolucion = AEstrella.obtener_camino_solucion(hojaSolucion);
            AEstrella.imprimir_camino_solucion(caminoSolucion);
            System.out.println("Número de hojas :" + Variables.HOJAS.size());
        } else {
            System.out.println("No tiene solucion.");
            imprimir_matriz(matriz);
        }

    }

    /**
     * Determina si la condición inicial de la matriz tiene solución
     * @param matrix: representa la condición inicial del 8 puzzle
     * @return devuelve si la matriz inicial tiene solución o no.
     */
    public static boolean tieneSolucion(int[][] matrix) {
        int count = 0;
        List<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array.add(matrix[i][j]);
            }
        }

        Integer[] anotherArray = new Integer[array.size()];
        array.toArray(anotherArray);

        for (int i = 0; i < anotherArray.length - 1; i++) {
            for (int j = i + 1; j < anotherArray.length; j++) {
                if (anotherArray[i] != 0 && anotherArray[j] != 0 && anotherArray[i] > anotherArray[j]) {
                    count++;
                }
            }
        }

        return count % 2 == 0;
    }

    /**
     * Impresión de la matriz del 8 puzzle con un formato
     * @param matriz: representa en forma de matriz el 8 puzzle
     */
    public static void imprimir_matriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("|  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("  |");
        }
    }

    /**
     * Generación de matriz randómica para estado inicial del 8 puzzle
     * @return Devuelve el estado objetivo del 8 puzzle
     */
    public static int[][] generar_matriz() {
        int[][] inicio = {{0,1,2},{3,4,5},{6,7,8}};
        Estado matriz_randomica = new Estado(inicio);
        int numero_pasos =0;
        do{
           numero_pasos = (int) (Math.random() * 50);
        }while(!(numero_pasos>=20));
        for (int i = 0; i < numero_pasos; i++) {
            int numero_cambios = (int) (Math.random() * matriz_randomica.generar_estados().size());
            matriz_randomica.estado_actual = matriz_randomica.generar_estados().get(numero_cambios).estado_actual;
        }
        System.out.println(numero_pasos);
        inicio=matriz_randomica.estado_actual;
        return inicio;
    }

}
