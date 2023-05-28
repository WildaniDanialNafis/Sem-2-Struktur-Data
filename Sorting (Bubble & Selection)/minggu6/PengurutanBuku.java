/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
public class PengurutanBuku {
    public Buku[] listBuku = new Buku[4];
    public int bukuKe = 0;

    public void tambahBuku(Buku b) {
        if (bukuKe < listBuku.length) {
            listBuku[bukuKe] = b;
            bukuKe++;
        } else {
            System.out.println("Rak buku sudah penuh!!");
        }
    }

    public void tampilList() {
        for (int i = 0; i < listBuku.length; i++) {
            listBuku[i].tampilBuku();
        }
    }

    public void pengurutanUkuran() {
        for (int i = 0; i < listBuku.length-1; i++) {
            for (int j = 1; j < listBuku.length-i; j++) {
                if(listBuku[j-1].tinggi > listBuku[j].tinggi) {
                    Buku temp = listBuku[j-1];
                    listBuku[j-1] = listBuku[j];
                    listBuku[j] = temp;
                }
            }
        }
    }

    public void pengurutanHalaman() {
        for (int i = 0; i < listBuku.length-1; i++) {
            int idx_min = i;
            for (int j = i+1; j < listBuku.length; j++) {
                if (listBuku[j].jumlahHalaman < listBuku[idx_min].jumlahHalaman) {
                    idx_min = j;
                }
            }
            Buku temp = listBuku[idx_min];
            listBuku[idx_min] = listBuku[i];
            listBuku[i] = temp;
        }
    }
}
