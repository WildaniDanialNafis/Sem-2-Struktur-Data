/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class PencarianMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] data = {2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.9};
        OrderedSearch os = new OrderedSearch(data);
        System.out.println("Isi elemen array: ");
        os.tampilkan();
        double key = 3.12;
        int index = os.cari(key);
        if (index != -1) {
            System.out.println("Data " + key + " pada index " + index);
        } else {
            System.out.println("Data " + key + "tidak ditemukan");
        }
    }
    
}
