/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class ArrayTerbesarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayNilai = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        ArrayTerbesar nilai = new ArrayTerbesar(arrayNilai);

        System.out.print("Array :");
        
        for (int i = 0; i < nilai.getArray().length; i++) {
            System.out.print(" " + nilai.getArray()[i]);
        }

        System.out.println("\n------------------------");

        int nilaiTerbesar = nilai.cariNilaiTerbesar();
        System.out.println("Nilai terbesar : " + nilaiTerbesar);
        System.out.print("Terdapat pada index ke :");
        nilai.tampilIndex(nilaiTerbesar);
    }
    
}
