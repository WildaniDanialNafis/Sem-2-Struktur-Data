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
public class BukuMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] judul = {"Algoritma Pemrograman", "Basis Data", "Dasar Pemrograman", "Rekayasa Perangkat Lunak"};
        int[] halaman = {1292, 400, 294, 824};
        String[] ukuran = {"B5", "A4", "B3", "B2"};
        PengurutanBuku urutan = new PengurutanBuku();

        for (int i = 0; i < judul.length; i++) {
            Buku buku = new Buku(judul[i], halaman[i], ukuran[i]);
            urutan.tambahBuku(buku);
        }

        boolean seterusnya = true;
        while(seterusnya) {
            System.out.println("==============");
            System.out.println("Pilih Tindakan");
            System.out.println("==============");
            System.out.println("1. Tampilkan list buku");
            System.out.println("2. Urutkan berdasarkan halaman");
            System.out.println("3. Urutkan berdasarkan ukuran");
            System.out.println("4. Selesai");
            System.out.print("Pilih (1-4) : ");
            int pilih = input.nextInt();
            System.out.println();

            switch(pilih) {
                case 1 :
                urutan.tampilList();
                break;
                case 2 :
                urutan.pengurutanHalaman();
                urutan.tampilList();
                break;
                case 3 :
                urutan.pengurutanUkuran();
                urutan.tampilList();
                break;
                case 4 :
                seterusnya = false;
                break;
                default : 
                System.out.println("Inputan salah!!, masukkan antara (1-4)");
            }
        }
    }
    
}
