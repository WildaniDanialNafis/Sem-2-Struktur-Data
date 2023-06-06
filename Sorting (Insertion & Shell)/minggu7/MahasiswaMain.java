/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("----");
        System.out.println("Menu");
        System.out.println("----");
        System.out.println("1. Masukkan data nilai");
        System.out.println("2. Tampilkan data");
        System.out.println("3. Urutkan data");
        System.out.println("4. Tampilkan tiga mahasiswa terbaik");
        System.out.println("5. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListMahasiswa list = new ListMahasiswa(5);
        int pilih;
        
        do {
            menu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch(pilih) {
                case 1: 
                    System.out.println("-------------");
                    System.out.println("Masukkan data");
                    System.out.println("-------------");
                    System.out.print("Nama: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Nilai A: ");
                    int nilaiA = sc.nextInt();
                    System.out.print("Nilai B: ");
                    int nilaiB = sc.nextInt();
                    System.out.print("Nilai C: ");
                    int nilaiC = sc.nextInt();
                    Mahasiswa mhs = new Mahasiswa(nama, nilaiA, nilaiB, nilaiC);
                    list.tambah(mhs);
                    System.out.println("Data berhasil ditambahkan");
                    break;
                case 2 :
                    list.tampilList();
                    break;
                case 3 :
                    Mahasiswa[] urut = list.shellSort();
                    list.tampilListUrut(urut);
                    break;
                case 4 :
                    urut = list.shellSort();
                    list.tampilTerbaik(urut);
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
    
}
