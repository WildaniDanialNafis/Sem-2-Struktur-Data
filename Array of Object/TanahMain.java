/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class TanahMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTanah, panjang, lebar, max = 0;

        System.out.print("Jumlah tanah: ");
        jumlahTanah = input.nextInt();

        Tanah[] arrayTanah = new Tanah[jumlahTanah];
        
        for (int i = 0; i < jumlahTanah; i++) {

            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            panjang = input.nextInt();
            System.out.print("Lebar: ");
            lebar = input.nextInt();
            
            arrayTanah[i] = new Tanah(panjang, lebar);
        }
        System.out.println();

        for (int i = 0; i < jumlahTanah; i++) {
            System.out.println("Luas Tanah " + (i+1) + ": " + arrayTanah[i].luasTanah());
            if (arrayTanah[i].luasTanah() > max) {
                max = arrayTanah[i].luasTanah();
            }
        }
        System.out.println();
        
        for (int i = 0; i < jumlahTanah; i++) {
            if (arrayTanah[i].luasTanah() == max) {
                System.out.println("Tanah terluas: Tanah " + (i+1));
            }
        }
    }
}
