
package com.arcos.patronadaptador;


public class DemoAdaptador {
    public static void main(String[] args) {
        ReproductorAudio reproductorAudio = new ReproductorAudio();
        
        reproductorAudio.reproducir("mp3", "Despacito.mp3");
        reproductorAudio.reproducir("mp4", "La Bicicleta.mp4");
        reproductorAudio.reproducir("vlc", "Hawai.vlc");
        reproductorAudio.reproducir("avi", "Despacito.avi");
       
    }
}
