/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evalprakmodul4no2;

/**
 *
 * @author LENOVO
 */
public class Evalprakmodul4no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RumahSakit rsa = new Dokter();
        RumahSakit rsb = new Pasien();
        RumahSakit rsc = new Perawat();
        
        rsa.kerja();
        rsb.kerja();
        rsc.kerja();
    }
    
}
