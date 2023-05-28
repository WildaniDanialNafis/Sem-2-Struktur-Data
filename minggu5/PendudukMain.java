/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class PendudukMain {

    /*
     * @param args the command line arguments
     */
    public static int tampilDicari(int dicari, Penduduk[] arrPend) {
        int index = -1;
        for (int i = 0; i < arrPend.length; i++) {
            if (dicari == arrPend[i].getNik()) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nikDicari, indexPenduduk, jumlahPenduduk;

        System.out.print("Masukkan jumlah penduduk: ");
        jumlahPenduduk = sc.nextInt();
        Penduduk[] arrayPenduduk = new Penduduk[jumlahPenduduk];

        for (int i = 0; i < arrayPenduduk.length; i++) {
            int nik;
            String nama;
            String alamat;
            String jenisKelamin;
            
            System.out.println("Penduduk ke-" + i);
            System.out.print("NIK : ");
            nik = sc.nextInt();
            System.out.print("Nama : ");
            nama = sc.next();
            System.out.print("Alamat : ");
            alamat = sc.next();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.next();

            arrayPenduduk[i] = new Penduduk((i+1), nik, nama, alamat, jenisKelamin);
            System.out.println();
        }

        System.out.println("--- DATA PENDUDUK ---");
        System.out.println("NO\tNIK\tNAMA\tALAMAT\tJENIS KELAMIN");
        for (int i = 0; i < arrayPenduduk.length; i++) {
            arrayPenduduk[i].tampilPenduduk();
        }
        System.out.println();
        System.out.println("--- CARI DATA PENDUDUK ---");
        System.out.print("Masukkan data yang dicari : ");
        nikDicari = sc.nextInt();
        
        indexPenduduk = tampilDicari(nikDicari, arrayPenduduk);
        arrayPenduduk[indexPenduduk].tampilPenduduk();
    }
    
}
