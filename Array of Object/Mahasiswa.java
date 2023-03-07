/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
public class Mahasiswa {
    public String nama;
    public int nim;
    public char jenisKelamin;
    public float ipk;
    
    public Mahasiswa() {
        
    }
    
    public Mahasiswa(String nam, int nm, char jk, float ip) {
        nama = nam;
        nim = nm;
        jenisKelamin = jk;
        ipk = ip;
    }

    public void tampilData() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + ipk);
    }
}
