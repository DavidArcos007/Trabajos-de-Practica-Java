package com.arcos.patronprototypeleccion;

public class demoPatronPrototypeLeccion {

    public static void main(String[] args) {
        CAdminPrototype admin = new CAdminPrototype();
        //instancias
        CCuadrado una = (CCuadrado) admin.obtenerPrototipo("Cuadrado");
        CCuadrado dos = (CCuadrado) admin.obtenerPrototipo("Cuadrado");
        //valores originales
        System.out.println(una);
        System.out.println(dos);
        System.out.println("******************************************");
        //modificamos el estado
        una.setColor("celeste");
        dos.setColor("amarillo");
        dos.setArea(15);
        //que tenga su estado 
        System.out.println(una);
        System.out.println(dos);
        System.out.println("******************************************");
        //primera instancia 
        CRectangulo rectangulo1 = new CRectangulo("Cuadrilatero", 19);
        //catalogo de prototipos 
        admin.adcionarPrototipos("Rectangulo", rectangulo1);
        // clonar el objeto 
        CRectangulo rectangulo2 = (CRectangulo) admin.obtenerPrototipo("Rectangulo");
        //cambio de estado 
        rectangulo2.setTipo("Escaleno");
        //verificacion del estado 
        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println("******************************************");

    }

}
