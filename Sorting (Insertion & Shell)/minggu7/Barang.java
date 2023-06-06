/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class Barang {
    private String namaBarang;
    private int stok;
    private int harga;

    public Barang(String namaBarang, int stok, int harga) {
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilBrg() {
        System.out.println(this.namaBarang + "\t\t" + this.stok + "\t" + this.harga);
    }

    public int getStok() {
        return this.stok;
    }
}
