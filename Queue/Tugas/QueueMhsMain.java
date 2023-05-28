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
public class QueueMhsMain {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Menambah antrian");
        System.out.println("2. Mengurangi antrian");
        System.out.println("3. Menampilkan daftar antrian");
        System.out.println("4. Menampilkan antrian pertama");
        System.out.println("5. Menampilkan antrian terakhir");
        System.out.println("6. Mencari urutan antrian");
        System.out.println("7. Mencari data pada antrian");
        System.out.println("------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        QueueMhs antri = new QueueMhs(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1 :
                    System.out.println("Masukkan data Mahasiswa antrian baru");
                    System.out.print("Masukkan nim: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan absen: ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan ipk: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.enqueue(mhs);
                    break;
                case 2 :
                    Mahasiswa data = antri.dequeue();
                    if (!"".equals(data.getNim()) && !"".equals(data.getNama()) && data.getAbsen() != 0 && data.getIpk() != 0) {
                        System.out.println("Mahasiswa yang keluar antrian: " + data.getNim() + " " + data.getNama() + " " + data.getAbsen() + " " + data.getIpk());
                        break;
                    }
                case 3 :
                    System.out.println("Daftar antrian mahasiswa: ");
                    antri.print();
                    break;
                case 4 :
                    antri.peek();
                    break;
                case 5 :
                    antri.peekRear();
                    break;
                case 6 :
                    System.out.print("Masukkan nim Mahasiswa yang dicari: ");
                    String nimDicari = sc.nextLine();
                    antri.peekPosition(nimDicari);
                    break;
                case 7 :
                    System.out.print("Masukkan urutan antrian Mahasiswa yang dicari: ");
                    int posisi = sc.nextInt();
                    antri.printMahasiswa(posisi);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    
}
