import java.util.Scanner;

public class Tugas6Sem2 {
    public static double hitungKecepatan() {
        double jarak, waktu;
        Scanner input = new Scanner(System.in);
        System.out.println("=====KECEPATAN=====");
        System.out.print("Masukkan Jarak : ");
        jarak = input.nextDouble();
        System.out.print("Masukkan Waktu : ");
        waktu = input.nextDouble();
        System.out.println("==================");
        return (jarak / waktu);
    }
    public static double hitungJarak() {
        double waktu, kecepatan;
        Scanner input = new Scanner(System.in);
        System.out.println("=====JARAK=====");
        System.out.print("Masukkan Waktu : ");
        waktu = input.nextDouble();
        System.out.print("Masukkan Kecepatan : ");
        kecepatan = input.nextDouble();
        System.out.println("==================");
        return (kecepatan * waktu);
    }
    public static double hitungWaktu() {
        double kecepatan, jarak;
        Scanner input = new Scanner(System.in);
        System.out.println("=====WAKTU=====");
        System.out.print("Masukkan Kecepatan : ");
        kecepatan = input.nextDouble();
        System.out.print("Masukkan Jarak : ");
        jarak = input.nextDouble();
        System.out.println("==================");
        return (jarak / kecepatan);
    }
    public static int pilihan() {
        Scanner input = new Scanner(System.in);
        int pilih;
        pilih = input.nextInt();
        if (pilih == 1 || pilih == 2 || pilih == 3) {
            return pilih;
        }
        else {
            System.out.print("Masukkan antara (1-3) : ");
            return pilihan();
        }
    }
    public static void main(String[] args) {
        int pilih;

        System.out.println("Pilih Rumus");
        System.out.println("=======MENU=======");
        System.out.println("1. Rumus Kecepatan");
        System.out.println("2. Rumus Jarak");
        System.out.println("3. Rumus Waktu");
        System.out.println("=======PILIH=======");
        System.out.print("1/2/3 : ");
        pilih = pilihan();
        
        switch (pilih) {
            case 1 :
            System.out.println("Kecepatannya adalah " + hitungKecepatan());
            break;
            case 2 :
            System.out.println("Jaraknya adalah " + hitungJarak());
            break;
            case 3 :
            System.out.println("Waktunya adalah " + hitungWaktu());
            break;
        }
    }
}
total = fungsi1 - fungsi2