package com.arcos.reloj;

import java.util.Date;

public class Reloj extends Thread {

    private static Reloj reloj;

    private Reloj() {

    } 

    public static Reloj obtenerInstancia() {
        if (reloj == null) {
            reloj = new Reloj();
            reloj.start();
        }
        return reloj;
    }

    @Override
    public void start() {
        while (true) {
            Date hora = new Date(System.currentTimeMillis());
            System.out.println(hora);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
