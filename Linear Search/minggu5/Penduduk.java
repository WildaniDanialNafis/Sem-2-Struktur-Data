/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class Penduduk {
    private int no;
    private int nik;
    private String nama;
    private String alamat;
    private String jenisKelamin;

    public Penduduk(int n, int ni, String nm, String alm, String jns) {
        no = n;
        nik = ni;
        nama = nm;
        alamat = alm;
        jenisKelamin = jns;
    }

    public int getNik() {
        return nik;
    }

    public void tampilPenduduk() {
        System.out.println(no + "\t" + nik + "\t" + nama + "\t" + alamat + "\t" + jenisKelamin);
    }
}
