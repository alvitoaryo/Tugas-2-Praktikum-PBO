/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Aluito Aryo Prabowo
 */
public class balok extends persegipanjang implements MenghitungRuang{

    double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.tinggi = tinggi;
    }
    
    


    public double volume() {
        return volume(this.getPanjang(),this.getLebar(),this.tinggi);
    }
    
    public double volume(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }

    
    public double luasPermukaan() {
        return luasPermukaan(this.getPanjang(), this.getLebar(), this.tinggi);
    }
    
    public double luasPermukaan(double panjang, double lebar, double tinggi){
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    
    

}
