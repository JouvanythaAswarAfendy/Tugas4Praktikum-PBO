/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author HP
 */
public class LuasBalok extends LuasPermukaan{
    public LuasBalok(int p, int l, int t){
        super (p, l, t);
    }
    
    int Luas(){
        return 2 * ((p*l)+(p*t)+(l*t));
    }
    
    void hasilLuasBalok(){
        System.out.println("Luas Permukaan Balok (p : 27cm, l : 4cm, t : 7cm)   = " + Luas());
    }
}
