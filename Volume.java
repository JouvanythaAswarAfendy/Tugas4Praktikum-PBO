/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author HP
 */
public class Volume {
    int p, l, t;
    
    public Volume(int p){
        this.p = p;
    }
    public Volume(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;  
    }
    
    int volumeKubus(){
        return p*p*p;
    }
    
    int volumeBalok(){
        return p*l*t;
    }
    
    void tampilanKubus(){
        System.out.println("Volume Kubus (7cm)              = " + volumeKubus());
    }
    
    void tampilanBalok(){
        System.out.println("Volume Balok (7cm * 2cm * 4cm)  = " + volumeBalok());
    }
}
