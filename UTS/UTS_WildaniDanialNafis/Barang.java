/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_WildaniDanialNafis;

/**
 *
 * @author ACER
 */
public class Barang {
    public String kode;
    public String nama;
    public int stok;
    public int hargaSatuan;

    public Barang(String kode, String nama, int stok, int hargaSatuan) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    public void tampilBarang() {
        System.out.println(this.kode + "\t" + this.nama + "\t" + this.stok + "\t" + this.hargaSatuan);
    }
}
