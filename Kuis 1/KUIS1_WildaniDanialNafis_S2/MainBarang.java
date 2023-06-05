/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KUIS1_WildaniDanialNafis_S2;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class MainBarang {

    /**
     * @param args the command line arguments
     */
    public static void tampilMenu() {
        System.out.println("1. Tampil Barang");
        System.out.println("2. Beli");
        System.out.println("3. Tampil Pembelian");
        System.out.println("4. Keluar");
    }

    public static void pembelian() {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang[] arrayBarang = new Barang[5];
        int pilih;
        String kode;
        String tanya;
        
        arrayBarang[0] = new Barang("K01", "Sabun", 1000, 5);
        arrayBarang[1] = new Barang("K02", "Pasta Gigi", 2000, 10);
        arrayBarang[2] = new Barang("K03", "Biore", 3000, 23);
        arrayBarang[3] = new Barang("K04", "Shampoo", 4000, 55);
        arrayBarang[4] = new Barang("K05", "Sikat Gigi", 5000, 65);

        System.out.println("=======================");
        System.out.println("TOKO MAJU MUNDUR CANTIK");
        System.out.println("=======================");
        tampilMenu();
        System.out.print("Pilih[1-4] : ");
        pilih = sc.nextInt();
        if (pilih == 1) {
            System.out.println("=======================");
            System.out.println("DAFTAR BARANG");
            System.out.println("=======================");
            System.out.println("Kode\tNama\tHarga\tStok");
            
            for (int i = 0; i < arrayBarang.length; i++) {
                arrayBarang[i].tampilBarang();
            }
            System.out.println();

            tampilMenu();
            System.out.print("Pilih[1-4] : ");
            pilih = sc.nextInt();
            String[] arrayKode = new String[5];
        if (pilih == 2){
            System.out.println("=======================");
            System.out.println("DAFTAR BARANG");
            System.out.println("=======================");
            System.out.println("Kode\tNama\tHarga\tStok");
            
            for (int i = 0; i < arrayBarang.length; i++) {
                arrayBarang[i].tampilBarang();
            } 

            boolean statement = true;
            int j=0;
            while (statement) {
                System.out.print("Masukkan kode barang: ");
                kode = sc.next();
                
                for (int i = 0; i < arrayBarang.length; i++) {
                    if (kode.equalsIgnoreCase(arrayBarang[i].kode)) {
                        arrayKode[j] = kode;
                    }
                }
                System.out.print("Apakah akan belanja kembali(Y/N)?" );
                tanya = sc.next();
                
                if (tanya.equalsIgnoreCase("y")) {
                    statement = true;
                }
                else if (tanya.equalsIgnoreCase("n")) {
                    statement = false;
                }


                j++;
            }
        }
        tampilMenu();
        System.out.print("Pilih[1-4] : ");
        pilih = sc.nextInt();
        if (pilih == 3) {
            System.out.println("=======================");
            System.out.println("LIST PEMBELANJAAN");
            System.out.println("=======================");
            for (int i = 0; i < arrayKode.length; i++) {
                if (arrayKode[i] == null) {
                    break;
                }
                for (int k = 0; k < arrayBarang.length; k++) {
                    if (arrayKode[i].equalsIgnoreCase(arrayBarang[k].kode)) {
                        arrayBarang[i].tampilBarang();
                        break;
                    }
                }
            }
        }
        tampilMenu();
        System.out.print("Pilih[1-4] : ");
        pilih = sc.nextInt();
        if (pilih == 4) {
            
        }
        }

        
    }
    
}
