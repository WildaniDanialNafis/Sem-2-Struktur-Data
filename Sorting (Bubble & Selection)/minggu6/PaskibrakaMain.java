/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class PaskibrakaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarAnggotaPaskibraka daftarAnggota = new DaftarAnggotaPaskibraka();
        int bnykAnggota = 10;

        for (int i = 0; i < bnykAnggota; i++) {
            System.out.print("Nama : ");
            String nama = input.next();
            System.out.print("Kelas : "); 
            String kelas = input.next();
            System.out.print("Tinggi Badan : ");
            int tinggi = input.nextInt();

            Paskibraka calon = new Paskibraka(nama, kelas, tinggi);
            daftarAnggota.tambah(calon);
        }

        daftarAnggota.tampil();
        System.out.println("PASKIBRAKA DARI YANG TERTINGGI");
        daftarAnggota.sorting();
        daftarAnggota.tampil();
        daftarAnggota.lolos();
    }
    
}
