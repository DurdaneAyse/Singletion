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
public class Kanal {
    private String isim,link;
    public Kanal(String isim,String link){
        setIsim(isim);
        setLink(link);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
