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
public class Checkout {
    public static void main (String[] args){
        Proses p = new Proses ("Kevin","VVIP",80000);
        
        System.out.println("Nama anda = "+p.getNama());
        System.out.println("Jenis tiket yang di beli = "+p.getjenisTiket());
        System.out.println("Saldo anda sekarang = "+p.cekSaldo());
        System.out.println();
        System.out.println("Maaf saldo anda kurang cukup , anda perlu melakukan topup");
        p.isiSaldo(750000);
        System.out.println();
        System.out.println("Harga tiker VVIP sebesar Rp 800000 , apakah anda ingin membelinya?");
        System.out.println("Ya");
        System.out.println();
        System.out.println("Terima kasih telah membeli Tiket Konser");
        p.saldoBerkurang(800000);
    }
}
