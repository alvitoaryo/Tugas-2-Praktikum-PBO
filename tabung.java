/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Aluito Aryo Prabowo
 */
public class tabung extends lingkaran implements MenghitungRuang {
    
    double tinggi;

    public tabung(double jariJari, double tinggi) {
        this.setJariJari(jariJari);
        this.tinggi = tinggi;
    }
    

     public double volume() {
        return volume(this.luas(),this.tinggi);
    }
    
    public double volume(double luas, double tinggi){
        return luas*tinggi;  
    }
    public double luasPermukaan(){
        return luasPermukaan(this.getJariJari(), this.tinggi);
    }
    
    public double luasPermukaan(double jariJari, double tinggi){
        
        
        return 2 * (phi * jariJari * jariJari) + (2 * phi *jariJari * tinggi);
    }
    
}