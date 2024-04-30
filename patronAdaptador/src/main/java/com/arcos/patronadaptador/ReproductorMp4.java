
package com.arcos.patronadaptador;


public class ReproductorMp4 implements IReptroductorMultimediaAvanzado {
     @Override
    public void repoducirVlc(String nombreArchivo) {
        // no hacer nada
        
    }

    @Override
    public void reproducirMp4(String nombreArchivo) {
        
        System.out.println("Reproduccion de archivo VLC. Nombre: " + nombreArchivo);
    }
}
