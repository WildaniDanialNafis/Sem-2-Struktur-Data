/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
public class StrukMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laci tumpuk = new Laci(8);

        int[] noTransaksi = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] tglPembelian = {"7 Januari 2021", "14 Januari 2021", "21 Januari 2021", "28 Januari 2021", "5 Februari 2021", "10 Februari 2021", "17 Februari 2021", "24 Februari 2021"};
        int[] jumlahBrg = {12, 1, 5, 8, 2, 11, 14, 5};
        double[] totalHarga = {60000, 5000, 25000, 40000, 10000, 55000, 70000, 25000};

        for (int i = 0; i < 8; i++) {
            Struk strk = new Struk(noTransaksi[i], tglPembelian[i], jumlahBrg[i], totalHarga[i]);
            tumpuk.push(strk);
        }

        System.out.println("-------------------------------");
        tumpuk.print();
        System.out.println("-------------------------------");
        
        for (int i = 0; i < 5; i++) {
            tumpuk.pop();
        }

        System.out.println("-------------------------------");
        System.out.println("Sisa Struk");
        System.out.println("-------------------------------");
        tumpuk.print();
    }
    
}
