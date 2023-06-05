/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_WildaniDanialNafis;

/**
 *
 * @author ACER
 */
public class DaftarBarang {
    public Barang[] daftarBarang = new Barang[3];
    public int n = daftarBarang.length;
    public int[] barangTerlaris = new int[n];
    public int idx = 0;

    public void tambahBarang(Barang barang) {
        if (idx < n) {
            daftarBarang[idx] = barang;
            idx++;
        }
        else {
            System.out.println("Tempat Sudah Penuh!!");
        }
    }

    public Barang[] penjualan(String kode, int jumlah) {
        Barang[] daftarBaru = new Barang[5];

        for (int i = 0; i < n; i++) {
            if ((daftarBarang[i].kode).equalsIgnoreCase(kode)) {
                daftarBarang[i].stok = daftarBarang[i].stok - jumlah;
                daftarBaru[i] = daftarBarang[i];
                barangTerlaris[i] += jumlah;
            }
        }
        return daftarBaru;
    }

    public void tampilPenjualan(Barang[] daftarDibeli){
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 2; i++) {
            if (daftarDibeli != null) {
                daftarBarang[i].tampilBarang();
            }
        }
        System.out.println("------------------------------------------------");
    }


    public Barang[] urutStok() {
        Barang[] daftarBaru = new Barang[n];
        int nBaru = daftarBaru.length;
        for (int i = 0; i < nBaru; i++) {
            daftarBaru[i] = daftarBarang[i];
        }

        for (int i = 1; i < nBaru; i++) {
            Barang key = daftarBaru[i];
            int j = i - 1;
            while (j >= 0 && daftarBaru[j].stok < key.stok) {
                daftarBaru[j + 1] = daftarBaru[j];
                j--;
            }
            daftarBaru[j + 1] = key;
        }
        return daftarBaru;
    }
    public void barangTerlaris() {
        int max = 0;
        int idx = 0;
        for (int i = 0; i < barangTerlaris.length; i++) {
            if (barangTerlaris[i] > max) {
                max = barangTerlaris[i];
                idx = i;
            }
        }

        if (idx > 0) {
            System.out.println("Barang terlaris adalah " + daftarBarang[idx].nama + " dengan jumlah penjualan adalah " + barangTerlaris[idx]);
        }
        
    }

    public void tampilSemuaBarang() {
        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------------------------");
            System.out.println("Kode\t| Nama\t| Stok\t| Harga");
            daftarBarang[i].tampilBarang();
            System.out.println("-------------------------------------");
        }
    }

    public void tampilSemuaBarangUrut(Barang[] barangUrut) {
        for (int i = 0; i < barangUrut.length; i++) {
            System.out.println("------------------------------------------------");
            System.out.println("Kode\t| Nama\t| Stok\t| Harga");
            barangUrut[i].tampilBarang();
            System.out.println("-------------------------------------");
        }
    }
}
