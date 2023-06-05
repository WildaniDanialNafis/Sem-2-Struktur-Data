/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KUIS1_WildaniDanialNafis_S2;

/**
 *
 * @author ACER
 */
public class Barang {
    public String kode;
    public String nama;
    public int harga;
    public int stok;

    Barang() {

    }
    Barang(String kd, String nm, int hg, int st) {
        kode = kd;
        nama = nm;
        harga = hg;
        stok = st;
    }
    public void tampilBarang() {
        System.out.println(kode + "\t" + nama + "\t" + harga + "\t" + stok);
    }
}
