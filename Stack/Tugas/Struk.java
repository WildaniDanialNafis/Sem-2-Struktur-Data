/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
public class Struk {
    private int noTransaksi;
    private String tglPembelian;
    private int jumlahBrg;
    private double totalHarga;

    public Struk(int noTransaksi, String tglPembelian, int jumlahBrg, double totalHarga) {
        this.noTransaksi = noTransaksi;
        this.tglPembelian = tglPembelian;
        this.jumlahBrg = jumlahBrg;
        this.totalHarga = totalHarga;
    }

    public int getNoTransaksi() {
        return this.noTransaksi;
    }

    public String getTglPembelian() {
        return this.tglPembelian;
    }

    public int getJumlahBrg() {
        return this.jumlahBrg;
    }

    public double getTotalHarga() {
        return this.totalHarga;
    }
}
