/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class Mahasiswa {
    private String nama;
    private int nilaiA, nilaiB, nilaiC;

    public Mahasiswa() {

    }
    
    public Mahasiswa(String nama, int nilaiA, int nilaiB, int nilaiC) {
        this.nama = nama;
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }

    public void tampil() {
        System.out.println(this.nama + "\t" + this.nilaiA + "\t" + this.nilaiB + "\t" + this.nilaiC + "\t" + getTotal());
    }

    public int getTotal() {
        return nilaiA + nilaiB + nilaiC;
    }
}
