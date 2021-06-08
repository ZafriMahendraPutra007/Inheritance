/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author zafri
 */
public class Main {
    public static void main(String[] args){
        warna1 mobil1=new warna1();
        System.out.println("===Mobil 1===");
        mobil1.Mobil ="Lamborghini";
        mobil1.TipeWarna ="Biru";
        mobil1.display();
        
        warna2 mobil2=new warna2();
        System.out.println("===Mobil 2===");
        mobil2.Mobil ="Ferarri";
        mobil2.TipeWarna ="Hitam";
        mobil2.display();
        
        warna3 mobil3=new warna3();
        System.out.println("===Mobil 3===");
        mobil3.Mobil="Porsche";
        mobil3.TipeWarna="Hitam";
        mobil3.display();
    }
}