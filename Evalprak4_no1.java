/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evalprak4_no1;
/**
 *
 * @author LENOVO
 */
public class Evalprak4_no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pasien ps = new pasien();
        
        ps.setNama("Soke Bahtera");
        ps.setUmur(27);
        ps.setBerat(75);
        ps.setTinggi(185);
        ps.setSaturasi(98);
        System.out.println("Nama Pasien: " + ps.getNama());
        System.out.println("Umur: " + ps.getUmur());
        System.out.println("Berat Badan: " + ps.getBerat() +"kg");
        System.out.println("Tinggi Badan: " + ps.getTinggi() +"cm");
        System.out.println("Saturasi: " + ps.getSaturasi() +"%");
    }
    
}
