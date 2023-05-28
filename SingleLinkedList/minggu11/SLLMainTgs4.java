/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class SLLMainTgs4 {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Menambah antrian");
        System.out.println("2. Antri setelah nim tertentu");
        System.out.println("3. Antri sebelum nim tertentu");
        System.out.println("4. Antri pada nomor antrian tertentu");
        System.out.println("5. Mengurangi antrian");
        System.out.println("6. Keluar antrian nim tertentu");
        System.out.println("7. Keluar antrian nomor antrian tertentu");
        System.out.println("8. Menampilkan daftar antrian");
        System.out.println("9. Menampilkan antrian pertama");
        System.out.println("10. Menampilkan antrian terakhir");
        System.out.println("11. Mencari urutan antrian");
        System.out.println("12. Mencari data pada antrian");
        System.out.println("------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedListTgs4 antri = new SingleLinkedListTgs4();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
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
                    antri.addLast(mhs);
                    break;
                case 2 :
                    System.out.println("Masukkan data Mahasiswa antrian baru");
                    System.out.print("Masukkan nim: ");
                    String nim2 = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama2 = sc.nextLine();
                    System.out.print("Masukkan absen: ");
                    int absen2 = sc.nextInt();
                    System.out.print("Masukkan ipk: ");
                    double ipk2 = sc.nextDouble();
                    
                    Mahasiswa mhs2 = new Mahasiswa(nim2, nama2, absen2, ipk2);
                    sc.nextLine();
                    System.out.print("Antri setelah nim: ");
                    String setelah = sc.nextLine();
                    antri.insertAfter(setelah, mhs2);
                    antri.print();
                    break;
                case 3 :
                    System.out.println("Masukkan data Mahasiswa antrian baru");
                    System.out.print("Masukkan nim: ");
                    String nim3 = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama3 = sc.nextLine();
                    System.out.print("Masukkan absen: ");
                    int absen3 = sc.nextInt();
                    System.out.print("Masukkan ipk: ");
                    double ipk3 = sc.nextDouble();
                    
                    Mahasiswa mhs3 = new Mahasiswa(nim3, nama3, absen3, ipk3);
                    sc.nextLine();
                    System.out.print("Antri sebelum nim: ");
                    String sebelum = sc.nextLine();
                    antri.insertBefore(sebelum, mhs3);
                    antri.print();
                    break;
                case 4 :
                    System.out.println("Masukkan data Mahasiswa antrian baru");
                    System.out.print("Masukkan nim: ");
                    String nim4 = sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama4 = sc.nextLine();
                    System.out.print("Masukkan absen: ");
                    int absen4 = sc.nextInt();
                    System.out.print("Masukkan ipk: ");
                    double ipk4 = sc.nextDouble();
                    
                    Mahasiswa mhs4 = new Mahasiswa(nim4, nama4, absen4, ipk4);
                    sc.nextLine();
                    System.out.print("Antri pada index ke-: ");
                    int idx = sc.nextInt();
                    antri.insertAt(idx, mhs4);
                    antri.print();
                    break;
                case 5 :
                    System.out.println("Mahasiswa yang keluar antrian: ");
                    antri.peekHead();
                    antri.removeFirst();
                    break;
                case 6 :
                    System.out.print("Isi nim untuk keluar antrian: ");
                    String keluar = sc.nextLine();
                    antri.remove(keluar);
                    System.out.println("Mahasiswa dengan nim " + keluar + "sudah keluar antrian");
                    break;
                case 7 :
                    System.out.println("Isi urutan antrian yang keluar: ");
                    int antrian = sc.nextInt();
                    antri.removeAt(antrian);
                    System.out.println("Mahasiswa dengan antrian index ke-" + antrian + " sudah keluar");
                    break;
                case 8 :
                    System.out.println("Daftar antrian mahasiswa: ");
                    antri.print();
                    break;
                case 9 :
                    antri.peekHead();
                    break;
                case 10 :
                    antri.peekTail();
                    break;
                case 11 :
                    System.out.print("Masukkan nim Mahasiswa yang dicari: ");
                    String nimDicari = sc.nextLine();
                    System.out.println("Berada pada antrian ke-" + (antri.indexOf(nimDicari) + 1));
                    break;
                case 12 :
                    System.out.print("Masukkan urutan antrian Mahasiswa yang dicari: ");
                    int posisi = sc.nextInt();
                    Mahasiswa data =  antri.getData(posisi);
                    System.out.println(data.getNim() + " " + data.getNama() + " " + data.getAbsen() + " " + data.getIpk());
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10 || pilih == 11 || pilih == 12);
    }
    
}
