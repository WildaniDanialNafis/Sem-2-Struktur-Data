/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
public class Buku {
    public String judulBuku;
    public int jumlahHalaman;
    public String ukuran;
    public double tinggi;

    public Buku(String jb, int jh, String u) {
        judulBuku = jb;
        jumlahHalaman = jh;
        ukuran = u;
        switch (ukuran) {
            case "B5" :
            tinggi = 25;
            break;
            case "A4" :
            tinggi = 29.7;
            break;
            case "B3" :
            tinggi = 50;
            break;
            case "B2" :
            tinggi = 70.7;
            break;
        }
    }

    public void tampilBuku() {
        System.out.println("Judul Buku\t: " + judulBuku);
        System.out.println("Jumlah Halaman\t: " + jumlahHalaman);
        System.out.println("Ukuran\t\t: " + ukuran);
        System.out.println("------------------------");
    }
}
