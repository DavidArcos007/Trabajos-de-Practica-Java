
package com.arcos.patronadaptador;


public class AdaptadorReproductor implements IReproductorMultimedia {

    IReptroductorMultimediaAvanzado reproductorMusicaAvanzada;
    
    public AdaptadorReproductor( String tipoAudio ){
        if(tipoAudio.equalsIgnoreCase("vlc")){
            reproductorMusicaAvanzada = new ReproductorVlc();
        }else if(tipoAudio.equalsIgnoreCase("mp4")){
            reproductorMusicaAvanzada = new ReproductorMp4();
        } 
    }
    
    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        if(tipoAudio.equalsIgnoreCase("vlc")){
            reproductorMusicaAvanzada.repoducirVlc(nombreArchivo);
        }else if(tipoAudio.equalsIgnoreCase("mp4")){
           reproductorMusicaAvanzada.reproducirMp4(nombreArchivo); 
        }
    }
    
}

