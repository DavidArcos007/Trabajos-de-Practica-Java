package ia8puzzlearcosaguas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase donde se define la lógica del Algoritmo A*
 * @author David y Christian
 */

public class AEstrella {
    
	/**
	 * Método para crear el árbol basado en A* y devuelve el nodo solución
	 * @param nodo: corresponde a los diferentes nodos del árbol para encontrar la solución al problema
	 * @return devuelve el nodo solución
	 */
	public Nodo crear_arbol(Nodo nodo) {
        if (nodo.es_funcion_objetivo()) {
            System.out.println("¡Está resuelto!");
        } else {
            while (!nodo.es_funcion_objetivo()) {
                if (nodo.raiz) {
                    System.out.println("Nodo padre");
                    nodo.estado.imprimir_estado();
                    System.out.println(nodo);
                    nodo.expandir_nodos();
                    //Impresión nodos hijos
                    for (int i = 0; i < nodo.hijos.size(); i++) {
                        nodo.hijos.get(i).estado.imprimir_estado();
                        System.out.println(nodo.hijos.get(i));
                        System.out.println("----------------------");
                    }
                    nodo = Nodo.nodo_hoja_menor();
                    System.out.println("\nHoja con menor f(n) seleccionada");
                    nodo.estado.imprimir_estado();
                    System.out.println(nodo);
                } else {
                    System.out.println("Padre");
                    nodo.estado.imprimir_estado();
                    System.out.println(nodo);
                    nodo.expandir_nodos();
                    nodo = Nodo.nodo_hoja_menor();
                    System.out.println("\nHoja con menor f(n) seleccionada");
                    nodo.estado.imprimir_estado();
                    System.out.println(nodo);
                }
                
            }
            
        }
        return nodo;
    }

    /**
     * Devuelve el camino solución del Algoritmo A*
     * @param hojaSolucion: es el nodo con h(n)=0, es decir el nodo solución del problema
     * @return devuelve el camino más óptimo con respecto a f(n)
     */
	public static List<Nodo> obtener_camino_solucion(Nodo hojaSolucion) {
        List<Nodo> caminoSolucion = new ArrayList();
        do {
            caminoSolucion.add(hojaSolucion);
            hojaSolucion = hojaSolucion.padre;
        } while (hojaSolucion != null);

        return caminoSolucion;
    }

    /**
     * Impresión del camino solución con A*
     * @param caminoSolucion: indica el camino ópmtimo respecto a f(n)
     */
	public static void imprimir_camino_solucion(List<Nodo> caminoSolucion) {
        System.out.println("\n***************Camino Solución*****************");
        for (int i = caminoSolucion.size() - 1; i >= 0; i--) {
            System.out.println(caminoSolucion.get(i));
            caminoSolucion.get(i).estado.imprimir_estado();
            System.out.println("----------------------------");
        }
    }

}
