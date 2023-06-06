/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

import javax.xml.crypto.Data;

/**
 *
 * @author WILDANII
 */
public class ShellSortBarang {
    public Barang[] listBarang;
    public int id;

    public ShellSortBarang(int jumBarang) {
        listBarang = new Barang[jumBarang];
    }

    public void tambah(Barang barang) {
        if (id < listBarang.length) {
            listBarang[id] = barang;
            id++;
        } else {
            System.out.println("Daftar Barang sudah penuh!!");
        }
    }

    public void tampilListBrg() {
        System.out.println("Nama Barang\tStok\tHarga");
        for (int i=0; i<listBarang.length; i++) {
            listBarang[i].tampilBrg();
        }
    }

    public void shellSort() {
        int interval;
        for (interval = listBarang.length/2; interval > 0; interval/=2) {
            for (int i=interval; i<listBarang.length; i++) {
                Barang temp = listBarang[i];
                int j;
                for (j=i; j>=interval && listBarang[j-interval].getStok() < temp.getStok(); j-=interval) {
                    listBarang[j] = listBarang[j-interval];
                }
                listBarang[j] = temp;
            }
        }
    }
}
