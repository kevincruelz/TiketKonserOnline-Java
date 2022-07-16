/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author kevin
 */
public abstract class TiketKonserOnline {
    private String nama;
    private String jenistiket;
    private int saldo;
    
    TiketKonserOnline(String nama,String jenistiket,int saldo){
        this.nama = nama;
        this.jenistiket = jenistiket;
        this.saldo = saldo;
    }
    public String getNama(){
        return nama;
    }
    public String getjenisTiket(){
        return jenistiket;
    }
    public int cekSaldo(){
        return saldo;
    }
    abstract void topupsaldo (TiketKonserOnline tujuan , double nominal);
    void isiSaldo(double nominal){
        saldo+=nominal;
        System.out.println("Anda mengisi = "+saldo);
    }
    abstract void sisaldo(TiketKonserOnline tujuan , double nominal);
    void saldoBerkurang(double nominal){
        saldo-=nominal;
        System.out.println("Sisa saldo = "+saldo);
    }
}
