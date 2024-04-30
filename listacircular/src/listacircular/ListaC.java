package listacircular;

public class ListaC {

    protected Nodo primero;

    public ListaC() {
        this.primero = null;
    }

    public boolean insertar(Object dato) {
        try {
            if (this.primero == null) {
                this.primero = new Nodo(dato);
                this.primero.siguiente = this.primero;
                return true;
            }

            Nodo aux = this.primero;
            while (aux.siguiente != this.primero) {
                aux = aux.siguiente;
            }
            aux.siguiente = new Nodo(dato);
            aux.siguiente.siguiente = this.primero;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //deber
    public boolean insertarPos(Object dato, int pos) {
        if (pos < 0) {
            return false;
        }
        if (pos == 1) {
            return insertarPorPrimero(dato);
        }
        int posAct = 1;
        Nodo aux = this.primero;
        while (posAct != pos - 1 && aux.siguiente != this.primero) {
            aux = aux.siguiente;
            posAct++;
        }
        if (posAct == pos - 1) {
            Nodo nuevo = new Nodo(dato);
            if (aux.siguiente == this.primero) {
                nuevo.siguiente = this.primero;
                aux.siguiente = nuevo;
                return true;
            }
            nuevo.siguiente = aux.siguiente;
            aux.siguiente = nuevo;
            return true;
        }
        return false;
    }

    public boolean insertarPorPrimero(Object dato) {
        if (this.primero == null) {
            this.primero = new Nodo(dato);
            this.primero.siguiente = this.primero;
            return true;
        }
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = this.primero;
        Nodo aux = this.primero;
        while (aux.siguiente != this.primero) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
        this.primero = nuevo;
        return false;
    }

    public Object buscar(int pos) {
        if (pos < 1 || this.primero == null) {
            return null;
        }
        Nodo aux = this.primero;
        int posAct = 1;
        while (posAct != pos) {
            aux = aux.siguiente;
            posAct++;
        }
        return aux.dato;
    }

    boolean borrar(int pos) {
        int posAct = 1;
        if (pos < 1 || this.primero == null) {
            return false;
        }
        if (pos == 1) {
            if (this.primero.siguiente == this.primero) {
                this.primero = null;
            } else {
                Nodo aux = this.primero;
                while (aux.siguiente != this.primero) {
                    aux = aux.siguiente;
                }
                aux.siguiente = this.primero = this.primero.siguiente;
            }
            return true;
        }
        Nodo aux = this.primero;
        while (posAct != pos - 1) {
            aux = aux.siguiente;
            posAct += 1;
        }
        if (aux.siguiente != aux) {
            aux.siguiente = aux.siguiente.siguiente;
        } else {
            this.primero = null;
        }
        return true;
    }

    //a revisar por los estudiantes.
    boolean borrar(Object dato) {
        boolean borrado = false;
        while (this.primero != null && this.primero.dato.equals(dato)) {
            this.primero = this.primero.siguiente;
            borrado = true;
        }
        if (this.primero != null) {
            Nodo aux = this.primero;
            while (aux != null) {
                if (aux.siguiente != null && aux.siguiente.dato.equals(dato)) {
                    aux.siguiente = aux.siguiente.siguiente;
                    borrado = true;
                } else {
                    aux = aux.siguiente;
                }
            }
        }
        return borrado;
    }

    void imprimir() {
        if (this.primero != null) {
            Nodo aux = this.primero;
            do {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            } while (aux != this.primero);
        }
    }
}
