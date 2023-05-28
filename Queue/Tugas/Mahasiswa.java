/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private int absen;
    private double ipk;

    public Mahasiswa() {

    }
    
    public Mahasiswa (String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public int getAbsen() {
        return this.absen;
    }

    public double getIpk() {
        return this.ipk;
    }
}
