/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

import java.lang.invoke.VolatileCallSite;
/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class LuasPermukaanDanVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih, banyak;

        
        System.out.println("==================");
        System.out.println("Pilih Rumus");
        System.out.println("==================");
        System.out.println("1. Kubus");
        System.out.println("2. Tabung");
        System.out.println("3. Limas Persegi");
        System.out.println("------------------");
        System.out.print("(1/2/3) : ");
        pilih = input.nextInt();
        System.out.println("------------------");
        
        if (pilih == 1) {
            System.out.println("Rumus Kubus");
            System.out.println("------------------");
            System.out.print("Ingin menghitung berapa kali? : ");
            banyak = input.nextInt();
            Kubus[] arrayKubus = new Kubus[banyak];
            
            for (int i = 0; i < banyak; i++) {
                double rusuk;
                System.out.println("Kubus ke " + (i+1));
                System.out.print("Masukkan panjang rusuk : ");
                rusuk = input.nextInt();
                arrayKubus[i] = new Kubus(rusuk);
                System.out.println("Luas Permukaan\t: " + arrayKubus[i].luasPermukaan());
                System.out.println("Volume\t\t: " + arrayKubus[i].volume());   
            }
        }
        else if (pilih == 2) {
            System.out.println("Rumus Tabung");
            System.out.println("------------------");
            System.out.print("Ingin menghitung berapa kali? : ");
            banyak = input.nextInt();
            Tabung[] arrayTabung = new Tabung[banyak];
            
            for (int i = 0; i < banyak; i++) {
                double jariJari;
                double tinggi;
                System.out.println("Tabung ke " + (i+1));
                System.out.print("Masukkan panjang jari-jari : ");
                jariJari = input.nextInt();
                System.out.print("Masukkan panjang tinggi : ");
                tinggi = input.nextInt();
                arrayTabung[i] = new Tabung(jariJari, tinggi);
                System.out.println("Luas Permukaan\t: " + arrayTabung[i].luasPermukaan());
                System.out.println("Volume\t\t: " + arrayTabung[i].volume());   
            }
        }
        else if (pilih == 3) {
            System.out.println("Rumus Limas Persegi");
            System.out.println("------------------");
            System.out.print("Ingin menghitung berapa kali? : ");
            banyak = input.nextInt();
            LimasPersegi[] arrayLimasPersegi = new LimasPersegi[banyak];
            
            for (int i = 0; i < banyak; i++) {
                double rusukAlas;
                double tinggi;
                System.out.println("Limas ke " + (i+1));
                System.out.print("Masukkan panjang rusuk alas : ");
                rusukAlas = input.nextInt();
                System.out.print("Masukkan tinggi limas : ");
                tinggi = input.nextInt();
                arrayLimasPersegi[i] = new LimasPersegi(rusukAlas, tinggi);
                System.out.println("Luas Permukaan\t: " + arrayLimasPersegi[i].luasPermukaan());
                System.out.println("Volume\t\t: " + arrayLimasPersegi[i].volume());   
            }
        }
    }
    
}
