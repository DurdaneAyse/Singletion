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
public class MainActivity implements Activity {

    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
  mediaPlayer=MediaPlayer.getMediaPlayer();
    }

    public void oynat(Kanal kanal) {
        mediaPlayer.kanalSec(kanal);
        mediaPlayer.oynat();
    }

    public void durdur() {
        mediaPlayer.durdur();
    }
}
