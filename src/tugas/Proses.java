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
public class Proses extends TiketKonserOnline{

    public Proses(String nama, String jenistiket, int saldo) {
        super(nama, jenistiket, saldo);
        
    }

    @Override
    void topupsaldo(TiketKonserOnline tujuan, double nominal) {
    }

    @Override
    void sisaldo(TiketKonserOnline tujuan, double nominal) {
    }
}