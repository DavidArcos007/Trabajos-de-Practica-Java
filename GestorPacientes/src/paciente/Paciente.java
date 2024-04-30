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
public class Paciente {

    String ci;
    String nombre, ape;
    String diagnostico;
    int edad;

    public Paciente(String ci, String nombre, String ape, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.ape = ape;
        this.edad = edad;
    }

    public void insertarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void imprimirXConsola() {
        System.out.println(Mensajes.NOTIF.CEDULA.tx() + this.ci);
        System.out.println(Mensajes.NOTIF.NOMBRE.tx() + this.nombre);
        System.out.println(Mensajes.NOTIF.APELLIDO.tx() + this.ape);
        System.out.println(Mensajes.NOTIF.EDAD.tx() + this.edad);
        System.out.println(Mensajes.NOTIF.DIAG.tx() + this.diagnostico);
    }
}
