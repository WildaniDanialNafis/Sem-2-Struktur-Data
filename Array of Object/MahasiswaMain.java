/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[3];
        String nama;
        int nim;
        char jenisKelamin;
        float ipk;

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama : ");
            nama = input.next();
            System.out.print("Masukkan nim : ");
            nim = input.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            ipk = input.nextFloat();

            arrayMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);

            System.out.println();
        }
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("nama : " + arrayMahasiswa[i].nama);
            System.out.println("nim : " + arrayMahasiswa[i].nim);
            System.out.println("Jenis kelamin : " + arrayMahasiswa[i].jenisKelamin);
            System.out.println("IPK : " + arrayMahasiswa[i].ipk);
        }
    }
    
}
