/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class InsertionBarangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] namaBarang = {"Pensil", "Buku", "Penggaris", "Bulpen"};
        int[] stok = {35, 20, 50, 25};
        int[] harga = {1000, 5000, 1500, 2000};
        InsertionBarang urut = new InsertionBarang(4);

        for (int i=0; i<4; i++) {
            Barang barang = new Barang(namaBarang[i], stok[i], harga[i]);
            urut.tambah(barang);
        }

        System.out.println("-------------------------");
        System.out.println("Barang sebelum di urutkan");
        System.out.println("-------------------------");
        urut.tampilListBrg();
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Barang diurutkan Insertion Sort");
        System.out.println("-------------------------------");
        urut.insertionSort();
        urut.tampilListBrg();
    }
    
}
