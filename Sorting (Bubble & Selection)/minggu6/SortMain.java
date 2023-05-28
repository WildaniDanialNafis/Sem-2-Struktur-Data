/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;

/**
 *
 * @author ACER
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {15, 10, 7, 22, 5};
        Sort urut = new Sort(a, a.length);

        System.out.println("Data sebelum urut");
        urut.tampilData();
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.bubbleSort();
        urut.tampilData();
        System.out.println("Data sesudah urut Selection sort (ASC)");
        urut.selectionSort();
        urut.tampilData();
    }
    
}
