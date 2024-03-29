/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class QueueMainTgs {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        int pilih;
        QueueTgs Q = new QueueTgs(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 :
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2 :
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3 :
                    Q.print();
                    break;
                case 4 :
                    Q.peek();
                    break;
                case 5 :
                    Q.clear();
                    break;
                case 6 :
                    System.out.print("Masukkan data yang dicari: ");
                    int dicari = sc.nextInt();
                    Q.peekPosition(dicari);
                    break;
                case 7 :
                    System.out.print("Masukkan posisi data yang dicari: ");
                    int idxCari = sc.nextInt();
                    Q.peekAt(idxCari);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    } 
}
