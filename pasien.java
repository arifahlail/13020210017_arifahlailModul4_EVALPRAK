/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalprak4_no1;

/**
 *
 * @author LENOVO
 */
public class pasien {
    private String nama;
    private int umur;
    private double berat;
    private double tinggi;
    private int saturasi;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    public double getBerat(){
        return this.berat = berat;
    }
    
    public void setTinggi (double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getTinggi (){
        return this.tinggi;
    }
    
    public void setSaturasi(int saturasi){
        this.saturasi = saturasi;
    }
    
    public int getSaturasi(){
        return this.saturasi;
    }
}
