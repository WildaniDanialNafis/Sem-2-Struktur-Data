// Wildani Danial Nafis
// MI 1A
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis2_wildanidanialnafis;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class SLLNasabahMain {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("----------------------------------");
        System.out.println("PILIH TINDAKAN");
        System.out.println("----------------------------------");
        System.out.println("1. Tambah antrian Nasabah");
        System.out.println("2. Tampilkan daftar antrian");
        System.out.println("3. Mencari data nasabah input nama");
        System.out.println("4. Nasabah selesai dilayani (-1)");
        System.out.println("5. Tambah Nasabah darurat");
        System.out.println("6. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList antrian = new SingleLinkedList();
        int pilih;
        String noRek, nama, dicari;

        do {
            menu();
            System.out.print("pilih: ");
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1 :
                    System.out.print("Masukkan No. Rekening: ");
                    sc.nextLine();
                    noRek = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    Nasabah nasabah = new Nasabah(noRek, nama);
                    antrian.addLast(nasabah);
                    break;
                case 2 :
                    antrian.print();
                    break;
                case 3 :
                    System.out.print("Masukkan nama nasabah dicari: ");
                    sc.nextLine();
                    dicari = sc.nextLine();
                    int index = antrian.indexOf(dicari);
                    if (index == -1) {
                        System.out.println("Nama nasabah tidak ada dalam antrian");
                    } else {
                        Nasabah data = antrian.getData(index);
                        System.out.println("----------------------");
                        System.out.println("DATA DITEMUKAN");
                        System.out.println("----------------------");
                        data.print();
                    }
                    break;
                case 4 :
                    System.out.println("----------------------");
                    System.out.println("NASABAH KELUAR ANTRIAN");
                    System.out.println("----------------------");
                    antrian.peekHead();
                    antrian.removeFirst();
                    break;
                case 5 :
                    System.out.println("-------------------------");
                    System.out.println("NASABAH DARURAT ANTRIAN 1");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan No. Rekening: ");
                    sc.nextLine();
                    noRek = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    Nasabah nasabahDarurat = new Nasabah(noRek, nama);
                    antrian.addFirst(nasabahDarurat);
                    break;
            }
        } while (pilih >= 1 && pilih <= 5);
    }
    
}
