/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
import java.util.Scanner;
public class DLLTugasFilm {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
        System.out.println("===================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terkahir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListsFilm dll = new DoubleLinkedListsFilm();
        Film film;
        int pilih, id, index;
        String judul;
        float rating;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 :
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film:");
                    id = sc.nextInt();
                    System.out.println("Judul Film:");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc.nextFloat();
                    film = new Film(id, judul, rating);
                    dll.addFirst(film);
                    break;
                case 2 :
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("ID Film:");
                    id = sc.nextInt();
                    System.out.println("Judul Film:");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc.nextFloat();
                    film = new Film(id, judul, rating);
                    dll.addLast(film);
                    break;
                case 3 :
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke-");
                    System.out.println("ID Film:");
                    id = sc.nextInt();
                    System.out.println("Judul Film:");
                    sc.nextLine();
                    judul = sc.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc.nextFloat();
                    System.out.println("Data Film ini akan masuk di urutan ke-");
                    index = sc.nextInt();
                    film = new Film(id, judul, rating);
                    dll.add(film, index);
                    break;
                case 4 :
                    if (dll.size() > 0) {
                        Film first = dll.getFirst();
                        System.out.println("ID: " + first.getId());
                        System.out.println("Judul: " + first.getJudul());
                        System.out.println("Rating: " + first.getRating());
                        dll.removeFirst();
                        System.out.println("Berhasil dihapus");
                        dll.print();
                    } else {
                        System.out.println("Film masih kosong");
                    }
                    break;
                case 5 :
                    if (dll.size() > 0) {
                        Film last = dll.getLast();
                        System.out.println("ID: " + last.getId());
                        System.out.println("Judul: " + last.getJudul());
                        System.out.println("Rating: " + last.getRating());
                        dll.removeLast();
                        System.out.println("Berhasil dihapus");
                        dll.print();
                    } else {
                        System.out.println("Film masih kosong");
                    }
                    break;
                case 6 :
                    if (dll.size() > 0) {
                        System.out.print("Menghapus data film pada urutan ke-");
                        int hapus = sc.nextInt();
                        Film data = dll.get(hapus);
                        System.out.println("ID: " + data.getId());
                        System.out.println("Judul: " + data.getJudul());
                        System.out.println("Rating: " + data.getRating());
                        dll.remove(hapus);
                        System.out.println("Berhasil dihapus");
                        dll.print();
                    } else {
                        System.out.println("Film maih kosong");
                    }
                    break;
                case 7 :
                    dll.print();
                    break;
                case 8 :
                    System.out.print("Masukkan ID yang dicari: ");
                    int dicari = sc.nextInt();
                    dll.findID(dicari);
                    break;
                case 9 :
                    System.out.println("Top Ratings");
                    dll.urutRatingDesc();
                    dll.print();
                    break;
            }
        } while (pilih >= 1 && pilih <= 9);
    }
    
}
