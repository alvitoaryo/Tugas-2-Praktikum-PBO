/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author Aluito Aryo Prabowo
 */
public class main {

    
    public static void main(String[] args) {
         double p,l,t,r, tinggi;
        int pilih;
        
        Scanner input = new Scanner (System.in);
        do {
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. tabung");
        System.out.println("3. Keluar");
        System.out.print("Pilih : "); pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.print("Masukkan panjang : "); p = input.nextDouble();
            System.out.print("Masukkan lebar : "); l = input.nextDouble();
            System.out.print("Masukkan tinggi : "); t = input.nextDouble();
            
            balok balok = new balok(p,l,t);

            System.out.println("Keliling persegi panjang : " + balok.keliling());            
            System.out.println("Luas persegi panjang : " + balok.luas());
            
            System.out.println("Luas permukaan balok : " + balok.luasPermukaan());
            System.out.println("Volume Balok : " + balok.volume());

            
        }
        else if(pilih == 2){
            System.out.print("Masukkan jari-jari : "); r = input.nextDouble();
            System.out.print("Masukkan tinggi : "); tinggi = input.nextDouble();
            
            tabung tabung = new tabung(r, tinggi);

            System.out.println("Keliling lingkaran : " + tabung.keliling());            
            System.out.println("Luas lingkaran : " + tabung.luas());
            
            System.out.println("Luas permukaan tabung : " + tabung.luasPermukaan());
            System.out.println("Volume tabung : " + tabung.volume());

        }
        
        }while(pilih<3);
    }

}