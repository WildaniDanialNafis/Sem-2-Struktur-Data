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
public class KelompokMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] mahasiswa = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"}, 
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"}, 
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };
        Kelompok mhs = new Kelompok(mahasiswa);
        Scanner sc = new Scanner(System.in);
        String mhsDicari;
        boolean statement;
        int kelompok, urutan;

        System.out.println("Daftar Kelompok Mahasiswa");
        mhs.tampilAnggota();

        System.out.println("Masukkan nama mahasiswa yang dicari");
        mhsDicari = sc.nextLine();
        statement = mhs.mahasiswaDicari(mhsDicari);
        kelompok = mhs.kelompok(mhsDicari);
        urutan = mhs.urutan(mhsDicari);

        if (statement == true) {
            System.out.println("Mahasiswa bernama " + mhsDicari + " berada pada kelompok ke-" + kelompok + " dan urutan ke-" + urutan + " dalam kelompok");
        } else {
            System.out.println("Mahasiswa " + mhsDicari + " tidak ditemukan");
        }
    }
    
}
