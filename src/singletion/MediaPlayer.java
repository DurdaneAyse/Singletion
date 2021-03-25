/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletion;

/**
 *
 * @author AYŞE
 */
public class MediaPlayer implements Runnable {

    private Kanal kanal;
    private boolean kontrol;
    private static MediaPlayer mediaPlayer;

    public static  MediaPlayer getMediaPlayer() {
        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;
    }

    private MediaPlayer() {

    }

    public void kanalSec(Kanal kanal) {
        this.kanal = kanal;
    }

    public void oynat() {
        kontrol = true;
        new Thread(this).start();

    }

    public void durdur() {
        kontrol = false;
    }

    @Override
    public void run() {
        while (kontrol) {
            Main.sleep2(2000);
            System.out.println(kanal.getIsim() + " kanalı" + kanal.getLink() + " linki üzerinden oynatılıyor...");
        }
    }
}
