/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DELL
 */
public class Pacientes {

    Queue<Paciente> pacientes = new LinkedList<>();

    public boolean insertar(Paciente paciente) {
        if (!pacientes.offer(paciente)) {
            return false;
        }
        return true;
    }

    public Paciente atender() {
        Paciente aux = pacientes.poll();
        return aux;
    }

    public boolean buscar(String ci) {
        boolean retorno = false;
        for (Paciente paciente : pacientes) {
            if (paciente.ci.equals(ci)) {
                retorno = true;
            }
        }
        return retorno;
    }
    
    public Paciente estaVacia(){
        return pacientes.peek();
    }
    
    public boolean modificar(String ci, String nombre, String apellido, int nuevaEdad) {
        boolean retorno = false;
        for (Paciente paciente : pacientes) {
            if (paciente.ci.equals(ci)) {
                paciente.nombre = nombre;
                paciente.ape = apellido;
                paciente.edad = nuevaEdad;
                retorno = true;
            }
        }
        return retorno;
    }
}
