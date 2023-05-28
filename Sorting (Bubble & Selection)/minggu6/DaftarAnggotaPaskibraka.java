/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
public class DaftarAnggotaPaskibraka {
    public Paskibraka[] listPeserta = new Paskibraka[10];
    public int id;

    public void tambah (Paskibraka m) {
        if (id < listPeserta.length) {
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("Daftar seleksi sudah penuh!!");
        }
    }

    public void tampil() {
        for (int i = 0; i < listPeserta.length; i++) {
            listPeserta[i].tampilIdetitas();
        }
    }

    public void sorting() {
        for (int i = 0; i < listPeserta.length-1; i++) {
            int idx_min = i;
            for (int j = i + 1; j < listPeserta.length; j++) {
                if(listPeserta[j].tinggi > listPeserta[idx_min].tinggi) {
                    idx_min = j;
                }
            }
            Paskibraka temp = listPeserta[idx_min];
            listPeserta[idx_min] = listPeserta[i];
            listPeserta[i] = temp; 
        }
    }

    public void lolos() {
        System.out.println("LIST PASKIBRAKA YANG LOLOS");
        for (int i = 0; i < listPeserta.length; i++) {
            if (listPeserta[i].tinggi >= 170) {
                listPeserta[i].tampilIdetitas();
            }
        }
    } 
}
