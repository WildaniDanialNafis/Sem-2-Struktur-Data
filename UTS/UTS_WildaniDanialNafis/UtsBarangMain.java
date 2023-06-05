/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_WildaniDanialNafis;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class UtsBarangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kode, nama, kodeDibeli, submit, mengulang;
        int pilih, stok, harga, jumlahDibeli;
        boolean statement = true;
        DaftarBarang daftarbarang = new DaftarBarang();

        while(statement) {
            System.out.println("1. Input Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Cek Stok Barang Terbanyak");
            System.out.println("4. Cek Stok Barang Terlaris");
            System.out.println("5. Tampil Barang");
            System.out.println("Masukkan angka menu yang ingin dipilih:");
            pilih = input.nextInt();

            switch (pilih) {
                case 1 :
                System.out.println("Input data barang");
                for (int i = 0; i < 3; i++) {
                    System.out.print("Kode = " );
                    kode = input.next();
                    System.out.print("Nama = ");
                    nama = input.next();
                    input.nextLine();
                    System.out.print("Stok = ");
                    stok = input.nextInt();
                    System.out.print("Harga = ");
                    harga = input.nextInt();
    
                    Barang barang = new Barang(kode, nama, stok, harga);
    
                    daftarbarang.tambahBarang(barang);
                }
                System.out.println("Apakah anda ingin mengulang? Y / T");
                mengulang = input.next();
                if (mengulang.equalsIgnoreCase("y")) {
                    statement = true;
                } else {
                    statement = false;
                }
                break;

                case 2 :
                System.out.println("Data barang yang ada");
                daftarbarang.tampilSemuaBarang();
                boolean ulangi = true;
                while (ulangi) {
                    System.out.print("Masukkan kode barang yang akan dibeli = ");
                    kodeDibeli = input.next();
                    System.out.print("Masukkan jumlah barang yg dibeli = ");
                    jumlahDibeli = input.nextInt();
                    Barang[] dibeli = daftarbarang.penjualan(kodeDibeli, jumlahDibeli);
                    System.out.println("Apakah anda ingin menambahkan Barang yang dibeli?");
                    submit = input.next();
                    if (submit.equalsIgnoreCase("y")) {
                        ulangi = true;
                    }
                    else {
                        daftarbarang.tampilPenjualan(dibeli);
                        ulangi = false;
                    }
                }
                System.out.println("Apakah anda ingin mengulang? Y / T");
                mengulang = input.next();
                if (mengulang.equalsIgnoreCase("y")) {
                    statement = true;
                } else {
                    statement = false;
                }
                break;

                case 3 :
                System.out.println("Berikut ini adalah List Daftar Barang dengan stok terbanyak ke sedikit");
                Barang[] barangUrut = daftarbarang.urutStok();
                daftarbarang.tampilSemuaBarangUrut(barangUrut);
                System.out.println("Apakah anda ingin mengulang? Y / T");
                mengulang = input.next();
                if (mengulang.equalsIgnoreCase("y")) {
                    statement = true;
                } else {
                    statement = false;
                }
                break;

                case 4 :
                daftarbarang.barangTerlaris();
                System.out.println("Apakah anda ingin mengulang? Y / T");
                mengulang = input.next();
                if (mengulang.equalsIgnoreCase("y")) {
                    statement = true;
                } else {
                    statement = false;
                }
                break;

                case 5 :
                daftarbarang.tampilSemuaBarang();
                System.out.println("Apakah anda ingin mengulang? Y / T");
                mengulang = input.next();
                if (mengulang.equalsIgnoreCase("y")) {
                    statement = true;
                } else {
                    statement = false;
                }
                break;
            }
        }
    }
    
}
