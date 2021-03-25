/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletion;

import java.util.ArrayList;

/**
 *
 * @author AYŞE
 */
public class ListeActivity implements Activity{
   ArrayList<Kanal>kanalListesi;
   
   @Override
    public void onCreate(){
        kanalListesi=kanalListesi();
        
    }
    public Kanal kanalSec(int index){
        return kanalListesi.get(index);
    }
    public ArrayList<Kanal>kanalListesi(){
            ArrayList<Kanal>kanalListesi=new ArrayList<>();
            Kanal kanal1=new Kanal("kanal 1 "," www.kanal1.com");
            Kanal kanal2=new Kanal("kanal 2"," www.kanal2.com");
            kanalListesi.add(kanal1);
            kanalListesi.add(kanal2);
            return kanalListesi;
    }
}
