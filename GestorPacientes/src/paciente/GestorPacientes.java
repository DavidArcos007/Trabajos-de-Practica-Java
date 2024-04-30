/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;

/**
 *
 * @author DELL
 */
public class GestorPacientes {

    private Pacientes pacientes;

    GestorPacientes() {
        pacientes = new Pacientes();
    }

    boolean insertarPaciente(Paciente paciente) {
        return pacientes.insertar(paciente);
    }

    Paciente atenderPaciente() {
        return pacientes.atender();
    }

    boolean buscarPaciente(String ci) {
        return pacientes.buscar(ci);
    }
    
    Paciente existePaciente(){
        return pacientes.estaVacia();
    }
    
    boolean modificarPaciente(String ci, String nombre, String apellido, int edad) {
        return pacientes.modificar(ci, nombre, apellido, edad);
    }

}
