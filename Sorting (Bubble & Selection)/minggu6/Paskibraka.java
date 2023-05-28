/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
public class Paskibraka {
    public String nama;
    public String kelas;
    public int tinggi;

    Paskibraka(String a, String b, int c) {
        nama = a;
        kelas = b;
        tinggi = c;
    }

    public void tampilIdetitas() {
        System.out.println("---------------------------");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Tinggi Badan\t: " + tinggi);
        System.out.println("---------------------------");
    }
}
