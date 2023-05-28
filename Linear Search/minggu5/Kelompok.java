/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class Kelompok {
    private String[][] anggota;

    public Kelompok (String[][] angg) {
        anggota = new String[angg.length][angg[0].length];
        for (int i = 0; i < anggota.length; i++) {
            for (int j = 0; j < anggota[0].length; j++) {
                anggota[i][j] = angg[i][j];
            }
        }
    }

    public void tampilAnggota() {
        for (int i = 0; i < anggota.length; i++) {
            System.out.print("Kelompok " + (i+1) + "\t:\t");
            for (int j = 0; j < anggota[0].length; j++) {
                System.out.print(anggota[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean mahasiswaDicari(String mhsDicari) {
        boolean dicari = false;
        for (int i = 0; i < anggota.length; i++) {
            for (int j = 0; j < anggota[0].length; j++) {
                if (mhsDicari.equalsIgnoreCase(anggota[i][j])) {
                    dicari = true;
                    break;
                }
            }
        }
        return dicari;
    }

    public int kelompok(String mhsDicari) {
        int kelompok = 0;
        for (int i = 0; i < anggota.length; i++) {
            for (int j = 0; j < anggota[0].length; j++) {
                if (mhsDicari.equalsIgnoreCase(anggota[i][j])) {
                    kelompok = i + 1;
                }
            }
        }
        return kelompok;
    }

    public int urutan(String mhsDicari) {
        int urutan = 0;
        for (int i = 0; i < anggota.length; i++) {
            for (int j = 0; j < anggota[0].length; j++) {
                if (mhsDicari.equalsIgnoreCase(anggota[i][j])) {
                    urutan = j + 1;
                }
            }
        }
        return urutan;
    }
}
