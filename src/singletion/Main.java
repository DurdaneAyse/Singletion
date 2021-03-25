
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MainActivity mainactivity=new MainActivity();
     ListeActivity listeactivity=new ListeActivity();
     mainactivity.onCreate();
      listeactivity.onCreate();
 Kanal kanal=listeactivity.kanalSec(0); 
     mainactivity.onCreate();
     mainactivity.oynat(kanal);
     Main.sleep2(5000);
     listeactivity.onCreate();
     kanal=listeactivity.kanalSec(1);
     mainactivity.onCreate();
     mainactivity.durdur();
     mainactivity.oynat(kanal);
  }
      public static void sleep2(int sure){
         try{
         Thread.sleep(sure);
         } catch (InterruptedException e){
             e.printStackTrace();
         }
     }
}
