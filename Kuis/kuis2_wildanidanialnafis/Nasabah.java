/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2_wildanidanialnafis;

/**
 *
 * @author WILDANII
 */
public class Nasabah {
    private String noRekening;
    private String nama;

    public Nasabah(String noRekening, String nama) {
        this.noRekening = noRekening;
        this.nama = nama;
    }

    public Nasabah() {

    }

    public String getNoRek() {
        return this.noRekening;
    }

    public String getNama() {
        return this.nama;
    }

    public void print() {
        System.out.println("No. Rekening: " + this.noRekening);
        System.out.println("Nama: " + this.nama);
    }
}
