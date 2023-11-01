/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author HP
 */
public class DemoTugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Volume v1 = new Volume(7);
        Volume v2 = new Volume(7,2,4);
        LuasBalok lb = new LuasBalok(27,4,7);
        LuasKubus lk = new LuasKubus(7);
        
        
        System.out.println("========= Menghitung Volume =========");
        v1.tampilanKubus();
        v2.tampilanBalok();
        System.out.println("");
        System.out.println("================ Menghitung Luas Permukaan ================");
        lb.hasilLuasBalok();
        lk.hasilLuasKubus();
    }
    
}
