/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class DLLTugas1 {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListsAnt dll = new DoubleLinkedListsAnt();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 :
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian:");
                    int antrian = sc.nextInt();
                    System.out.println("Nama Penerima:");
                    String penerima = sc.next();
                    Antrian antri = new Antrian(antrian, penerima);
                    dll.addLast(antri);
                    break;
                case 2 :
                    if (dll.size() > 0) {
                        Antrian first = dll.getFirst();
                        System.out.println(first.getNama() + " telah selesai divaksinasi.");
                        dll.removeFirst();
                        dll.print();
                        System.out.println("Sisa Antrian: " + dll.size());
                    } else {
                        System.out.println("Antrian masih kosong");
                    }
                    break;
                case 3 :
                    dll.print();
                    System.out.println("Sisa Antrian: " + dll.size());
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);

    }
    
}
