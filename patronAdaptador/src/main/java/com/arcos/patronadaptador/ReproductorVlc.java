
package com.arcos.patronadaptador;


public class ReproductorVlc implements IReptroductorMultimediaAvanzado {

    @Override
    public void repoducirVlc(String nombreArchivo) {
        System.out.println("Reproduccion de archivo VLC. Nombre: " + nombreArchivo);
    }

    @Override
    public void reproducirMp4(String nombreArchivo) {
        // no hacer nada 
    }
    
}
