/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia8puzzlearcosaguas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de estados relacionados al juego 8 puzzle
 * 
 * @author David y Christian
 */
public class Estado {
	public int[][] estado_actual;
	public int valor_hn;

	/**
	 * Constructor de la clase Estado
	 * 
	 * @param estado_actual: define el estado actual analizado
	 */
	public Estado(int[][] estado_actual) {
		this.estado_actual = estado_actual;
	}

	/**
	 * Cálculo de la función heurística definida por la suma de los valores
	 * diferentes a los del estado objetivo
	 * 
	 * @return devuelve el valor de h(n)
	 */
	public int carlcular_hn() {
		this.valor_hn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (this.estado_actual[i][j] != Variables.ESTADO_OBJETIVO[i][j]) {
					this.valor_hn++;
				}
			}
		}
		return this.valor_hn;
	}

	/**
	 * Copia de la matriz padre en ese instante antes de realizar los movimientos posibles
	 * @return devuelve la copia de la matriz en estado actual
	 */
	public int[][] copiar_matriz() {
		int[][] copia_matriz = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				copia_matriz[i][j] = this.estado_actual[i][j];
			}
		}
		return copia_matriz;
	}

	/**
	 * Generación de la lista de estados existentes
	 * @return devuelve el listado de estados
	 */
	List<Estado> generar_estados() {
		List<Estado> listaEstados = new ArrayList<>();
		int[] posicionVacia = obtener_posicion_espacio_en_blanco(0);
		mover_arriba(posicionVacia, listaEstados);
		mover_abajo(posicionVacia, listaEstados);
		mover_izquierda(posicionVacia, listaEstados);
		mover_derecha(posicionVacia, listaEstados);
		return listaEstados;
	}

	/**
	 * Impresión de los estados
	 */
	public void imprimir_estado() {
		for (int i = 0; i < 3; i++) {
			System.out.print("|  ");
			for (int j = 0; j < 3; j++) {
				System.out.print(this.estado_actual[i][j]);
				if (j != estado_actual[i].length - 1) {
					System.out.print("\t");
				}
			}
			System.out.println("  |");
		}
	}

	/**
	 * Obtención de la posición del espacio en blanco del juego 8 puzzle
	 * @param posicionVacia: representa el bloque en blanco
	 * @return devuelve la posición en la que se encuentra el bloque en blanco
	 */
	public int[] obtener_posicion_espacio_en_blanco(int posicionVacia) {
		int posicion[] = new int[2];
		for (int i = 0; i < this.estado_actual.length; i++) {
			for (int j = 0; j < this.estado_actual[i].length; j++) {
				if (estado_actual[i][j] == posicionVacia) {
					posicion[0] = i;
					posicion[1] = j;
					return posicion;
				}
			}
		}
		return posicion;
	}

	/**
	 * Movimiento hacia arriba del espacio en blanco
	 * @param posicionVacia: posición del espacio en blanco
	 * @param listaEstados: lista de los estados existentes en el análisis
	 */
	void mover_arriba(int[] posicionVacia, List<Estado> listaEstados) {
		int i = posicionVacia[0];
		int j = posicionVacia[1];
		if (i > 0) {
			int aux[][] = copiar_matriz();
			aux[i][j] = aux[i - 1][j];
			aux[i - 1][j] = 0;
			listaEstados.add(new Estado(aux));
		}
	}

	/**
	 * Movimiento hacia abajo del espacio en blanco
	 * @param posicionVacia: posición del espacio en blanco
	 * @param listaEstados: lista de los estados existentes en el análisis
	 */
	void mover_abajo(int[] posicionVacia, List<Estado> listaEstados) {
		int i = posicionVacia[0];
		int j = posicionVacia[1];
		if (i < this.estado_actual.length - 1) {
			int aux[][] = copiar_matriz();
			aux[i][j] = aux[i + 1][j];
			aux[i + 1][j] = 0;
			listaEstados.add(new Estado(aux));
		}
	}

	/**
	 * Movimiento hacia la izquierda del espacio en blanco
	 * @param posicionVacia: posición del espacio en blanco
	 * @param listaEstados: lista de los estados existentes en el análisis
	 */
	void mover_izquierda(int[] posicionVacia, List<Estado> listaEstados) {
		int i = posicionVacia[0];
		int j = posicionVacia[1];
		if (j > 0) {
			int aux[][] = copiar_matriz();
			aux[i][j] = aux[i][j - 1];
			aux[i][j - 1] = 0;
			listaEstados.add(new Estado(aux));
		}
	}

	/**
	 * Movimiento hacia la derecha del espacio en blanco
	 * @param posicionVacia: posición del espacio en blanco
	 * @param listaEstados: lista de los estados existentes en el análisis
	 */
	void mover_derecha(int[] posicionVacia, List<Estado> listaEstados) {
		int i = posicionVacia[0];
		int j = posicionVacia[1];
		if (j < this.estado_actual.length - 1) {
			int aux[][] = copiar_matriz();

			aux[i][j] = aux[i][j + 1];
			aux[i][j + 1] = 0;
			listaEstados.add(new Estado(aux));
		}
	}
}
