/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Aluito Aryo Prabowo
 */
public class lingkaran implements MenghitungBidang {

    private double jariJari;
    double phi = 3.14;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

   
    public double keliling() {
        return keliling(this.jariJari);
    }
    
    public double keliling(double jariJari){
        return 2*phi*jariJari;
    }

 
    public double luas() {
        return luas(this.jariJari);
    }
    
    public double luas(double jariJari){
        return phi*jariJari*jariJari;
    }
    
    
    
    
}
