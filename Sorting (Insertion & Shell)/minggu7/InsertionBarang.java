/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class InsertionBarang {
    public Barang[] listBarang;
    public int id;

    public InsertionBarang(int jumBarang) {
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

    public void insertionSort() {
        for (int i=1; i<listBarang.length; i++) {
            Barang temp = listBarang[i];
            int j = i - 1;
            while (j>=0 && listBarang[j].getStok() < temp.getStok()) {
                listBarang[j+1] = listBarang[j];
                j--;
            }
            listBarang[j+1] = temp;
        }
    }
}
