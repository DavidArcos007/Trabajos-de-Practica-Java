/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolhilvanado;

/**
 *
 * @author felix
 */
public class ArbolHilv {

    NodoAHilv raíz;

    ArbolHilv() {
        this.raíz = null;
    }
void imprimirSimmetrico(){
    if (this.raíz == null){
        return;
    }
    NodoAHilv aux = this.raíz;
    while ( aux.enlIzq != null){
        aux = aux.enlIzq;
    }
    System.out.println((Integer)aux.dato);
    
    while (aux.enlDer != null){
        if (!aux.indiDer){
            aux = aux.enlDer;
        }else{
            NodoAHilv anterior = aux;
            aux = aux.enlDer;
            while(aux.enlIzq != anterior){
                aux = aux.enlIzq;
            }
        }
        System.out.println((Integer) aux.dato);
    }
}
    boolean insertarEnteros(Object dato) {
        if (this.raíz == null) {
            this.raíz = new NodoAHilv(dato);
            return true;
        }

        NodoAHilv padre = this.raíz;
        boolean encontrado = false;
        boolean ingresarIzq = false;

        while (!encontrado) {
            if (dato == (Integer) padre.dato) {
                return false;
            } else if ((Integer) (dato) < (Integer) padre.dato) {
                if (padre.enlIzq == null || !padre.indiIzq) {
                    encontrado = ingresarIzq = true;
                } else {
                    padre = padre.enlDer;
                }
            } else {
                if (padre.enlDer == null || !(padre.indiDer)) { //padre.indiDer == false
                    encontrado = true;
                    // ingresarIzq = false;
                } else {
                    padre = padre.enlDer;
                }

            }

        }

        if (ingresarIzq) {
            NodoAHilv nuevo = new NodoAHilv(dato);
            if (!padre.indiIzq) {
                nuevo.enlIzq = padre.enlIzq;
                nuevo.indiIzq = false;
            }
            padre.enlIzq = nuevo;
            padre.indiIzq = true;
            nuevo.enlDer = padre;
            nuevo.indiDer = false;
        } else {
            NodoAHilv nuevo = new NodoAHilv(dato);
            if (!padre.indiDer) {
                nuevo.enlDer = padre.enlDer;
                nuevo.indiDer = false;
            }
            padre.enlDer = nuevo;
            padre.indiDer = true;
            nuevo.enlIzq = padre;
            nuevo.indiIzq = false;
        }

        return true;
    }
   


       boolean insertarString(String dato) {
        if (this.raíz == null) {
            this.raíz = new NodoAHilv(dato);
            return true;
        }
        NodoAHilv padre = this.raíz;
        boolean encontrado = false;
        boolean ingresarIzq = false;

        while (!encontrado) {
            if (dato == padre.dato) {
                return false;
            } else if (dato.compareToIgnoreCase((String)(padre.dato))<0) {
                if (padre.enlIzq == null || !padre.indiIzq) {
                    encontrado = ingresarIzq = true;
                } else {
                    padre = padre.enlIzq;
                }
            } else {
                if (padre.enlDer == null || !(padre.indiDer)) { 
                    encontrado = true;
                } else {
                    padre = padre.enlDer;
                }
            }
        }
        if (ingresarIzq) {
            NodoAHilv nuevo = new NodoAHilv(dato);
            if (!padre.indiIzq) {
                nuevo.enlIzq = padre.enlIzq;
                nuevo.indiIzq = false;
            }
            padre.enlIzq = nuevo;
            padre.indiIzq = true;
            nuevo.enlDer = padre;
            nuevo.indiDer = false;
        } else {
            NodoAHilv nuevo = new NodoAHilv(dato);
            if (!padre.indiDer) {
                nuevo.enlDer = padre.enlDer;
                nuevo.indiDer = false;
            }
            padre.enlDer = nuevo;
            padre.indiDer = true;
            nuevo.enlIzq = padre;
            nuevo.indiIzq = false;
        }
        return true;
     }
    }
