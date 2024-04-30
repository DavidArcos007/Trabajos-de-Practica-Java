
package com.arcos.patronadaptador;


public class ReproductorAudio implements IReproductorMultimedia{
    AdaptadorReproductor adaptadorReproductor;
    
    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        //soporte incorpora para reproducir archivos de musica mp3
        if(tipoAudio.equalsIgnoreCase("mp3")){
            System.out.println("Reproduccion de archivos mp3. Nombre: " + nombreArchivo);
        }
        //adaptador Reproductor que proporciona soporta para reproduccir otros formatos de archivos 
        else if(tipoAudio.equalsIgnoreCase("vlc") || tipoAudio.equalsIgnoreCase("mp4")){
            adaptadorReproductor = new AdaptadorReproductor(tipoAudio);
            adaptadorReproductor.reproducir(tipoAudio, nombreArchivo);
        }else{
            System.out.println("Multimedia no valido. "+tipoAudio+ "formato no soporta");
        }
    }
    
}
